/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author e-zof
 */
public class demo {
    
    
    
    
    public void facto() {
        
        //etrada declaraxion de variables
        int numeroUno;
        
        int numeroDos;
        
        int factorial = 1;
        
        int factorialDos = 1;
        
            Scanner entradaDato = new Scanner(System.in);
        
        System.out.println("Buen día pinshi doc, captura el numero del cual quieres obtener factorial");
        
              numeroUno = entradaDato.nextInt();
                    
          
        System.out.println("Introduce el número dos  del cual quieres obtener la segunda factorial");      
              
                numeroDos =  entradaDato.nextInt();
        
        
              //proceso  factorial uno
              
              for (int i = numeroUno; i > 0; i--) {
                  
                  factorial = factorial * i;
            
        }
              
              //proceso factorial dos
              
              for (int x = numeroDos; x > 0; x--) {
            
                  
                  factorialDos = factorialDos * x;
                  
        }
             
              //salida
              
              System.out.println("La Factorial de " + numeroUno + " es: "  + factorial + "\n\n y la factorial de " + numeroDos + " es: " + factorialDos);
        
        
        
        
        
    }
    
    
}
