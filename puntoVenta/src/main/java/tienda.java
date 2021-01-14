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

public class tienda {
    
    
    public static void main(String[] args) {
        
        int menu;
        
        
        
        
           Scanner entrada = new Scanner(System.in);
           
           
           System.out.println("Bienvenido porfavor seleccione una opción");
           
           System.out.println("1. Calcular venta");
           System.out.println("2. Imprimir datos de sucursal");
           System.out.println("3. Imprimir datos del vendedor");
           System.out.println("4. Salir");

           
           menu = entrada.nextInt();
           
           switch(menu){
           
               case 1:
                   
                   int venta;
                   int cantidad;
                   int precio;
                   
                   System.out.println("Capture la cantidad del producto ");
                        
                        cantidad = entrada.nextInt();
           
                        System.out.println("Capture el precio del  del producto ");
                        
                        precio = entrada.nextInt();
                        
                        venta = (precio * cantidad);
                        
                        System.out.println("la Cantidad a cobrar es " + venta); break;
                        
               case 2:  System.out.println(" el nombre de la sucursal es santa fé ");   
                        System.out.println("Se encuentra en el D.F"); break;
                        
                        
                        
               case 3:  System.out.println(" Karina plata");   
                        System.out.println("vive en : "); break;
                        
               case 4: break;
           
           }
        
    }
    
}
