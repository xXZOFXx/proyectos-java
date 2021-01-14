/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e-zof
 */

import java.util.Scanner;


public class oxoo {
    
    
    
    
        public static void main(String[] args) {
            
            
            
            int cantidad;
            String producto;
            float resultadoFinal;
            float precio;
            int menu;
            
            
          
            
            Scanner entradaDatos = new Scanner(System.in);
            
            
             System.out.println("Bienvenido al sistema oxxo");  
             System.out.println("--------------------------");
             System.out.println("Introduzca producto a cobrar");
             System.out.println("1.Gansito");
             System.out.println("2.Refresco");
             System.out.println("3.Six de cerveza ");
             System.out.println("4.Café");
             System.out.println("5.Otro");
             
             
             menu = entradaDatos.nextInt();
            
           
               
             
             switch (menu){
             
                 case 1: System.out.println("Selecciona la cantidad de gansitos"); 
                         cantidad = entradaDatos.nextInt();
                         
                         resultadoFinal = (cantidad * 12);
                         
                         System.out.println("El precio del gansito es de 12 pesos mexicanos");
                         System.out.println("-------------------------------------");
                         System.out.println("la cantitad de gansitos es " + cantidad);
                         System.out.println("-------------------------------------");
                         System.out.println("El total de tu compra es "+ resultadoFinal ); break;

                         
                         
                           
                 
                 
                 case 2: System.out.println("Selecciona la cantidad de Refrescos  ");
                            cantidad = entradaDatos.nextInt();
                         
                         resultadoFinal = (cantidad * 15);
                         
                         System.out.println("El precio del Refresco es de 15 pesos mexicanos");
                         System.out.println("-------------------------------------");
                         System.out.println("la cantitad de Refrescos es " + cantidad);
                         System.out.println("-------------------------------------");
                         System.out.println("El total de tu compra es "+ resultadoFinal ); break;
                 
                 case 3: System.out.println("Selecciona la cantidad de six de cerveza");
                  cantidad = entradaDatos.nextInt();
                         
                         resultadoFinal = (cantidad * 150);
                         
                         System.out.println("El precio del Refresco es de 150 pesos mexicanos");
                         System.out.println("-------------------------------------");
                         System.out.println("la cantitad de Refrescos es " + cantidad);
                         System.out.println("-------------------------------------");
                         System.out.println("El total de tu compra es "+ resultadoFinal ); break;
                         
                case 4:  System.out.println("Selecciona la Cantidad de vasos de café"); 
                cantidad = entradaDatos.nextInt();
                         
                         resultadoFinal = (float) (cantidad * 33.40);
                         
                         System.out.println("El precio del café es de 32.50 pesos mexicanos");
                         System.out.println("-------------------------------------");
                         System.out.println("la cantitad de vasos de café es " + cantidad);
                         System.out.println("-------------------------------------");
                         System.out.println("El total de tu compra es "+ resultadoFinal ); break;
                         
                case 5: Scanner DatoVacio = new Scanner(System.in);  
                        System.out.println("¿Cuál es el nombre del producto?");
                        
                         producto = DatoVacio.nextLine();
                        
                         System.out.println("Selecciona la Cantidad de " + producto); 
                            cantidad = entradaDatos.nextInt();
                         
                         System.out.println("¿cuál es el precio de " + producto + " ?" );
                         
                         precio = entradaDatos.nextFloat();
                            
                         resultadoFinal = (float) (cantidad * precio);
                         
                         System.out.println("El precio de " + producto + "es de " + precio + " pesos mexicanos");
                         System.out.println("-------------------------------------");
                         System.out.println("la cantitad de " + producto + "es " + cantidad);
                         System.out.println("-------------------------------------");
                         System.out.println("El total de tu compra es " + resultadoFinal ); break;
                        
                        
                         
                         
                         
             
             }
            
            
    }
    
    
    
}
