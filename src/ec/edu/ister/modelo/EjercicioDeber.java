package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * Nombre: Cristian Calle
 */
public class EjercicioDeber {
    public static void ejercicio1(){
        
        for( int i=1;i<=100;i++)
            if(i%5==0 && i%25==0)
        	
                JOptionPane.showMessageDialog(null,"La i es: "+i);              //MENSAJE POR PANTALLA
	            
                   
	for(int j=1;j<=100;j++)
            if(j%75==0)
            JOptionPane.showMessageDialog(null,"La j es: "+j); 
	
        
    }
    public static void ejercicio2(){
        
        int total=0;
        for( int i=0;i<=5;i++) {
        total+=2;
        }
        JOptionPane.showMessageDialog(null,"La Respuesta es: "+total);  
        
    }
     public static void ejercicio3(){
        
        int []primes={1,3,6};
        int sum=0;
        for(int t:primes) {
            sum+=t;
        }
       JOptionPane.showMessageDialog(null,"La Respuesta es: "+sum++); 
        
    }
    public static void ejercicio4(){
        
        for(int i=1; i<6; i+=2) {
            for(int j=0; j<3;j++) {
                if(i+j>4)
                    break;
                JOptionPane.showMessageDialog(null,"La Respuesta es: "+i*j);
                
            }
        }
        
    }
    
    public static void ejercicio5(){
        
        int x=0;
        do{
          //JOptionPane.showMessageDialog(null,"La Respuesta es: "+x);
            System.out.print("-"+x);
          x++;
        }while(x>0);
                  
        }
    
    
    
    
    public static void menu(){
        int op;
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Ejercicio1\n"
                    + "2.- Ejercicio2\n"
                    + "3.- Ejercicio3\n"
                    + "4.- Ejercicio4\n"
                    + "5.- Ejercicio5\n"
                    + "6.- Salir"));
            switch(op){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;  
                case 3:
                    ejercicio3();
                    break; 
                case 4:
                    ejercicio4();
                    break;   
                case 5:
                    ejercicio5();
                    break;        
            }
            
            
        }while (op!=6);
        
    }
    
    

}
