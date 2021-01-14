/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;
import jdk.jshell.execution.Util;

/**
 *
 * @author e-zof
 */
public class numeros {
    
    
       public static void main(String[] args) {
       
           //entrada
           int numUno;
           int numDos;
           
           //proceso
           
           
           Scanner entrada = new Scanner(System.in);
                   
           
           System.out.println("Bienvenido, dijite  número uno");
          
           numUno =  entrada.nextInt();
           
           System.out.println("Dijite número dos");
           
           numDos = entrada.nextInt();
           
           
           
           if ( numUno == numDos) {
               
               System.out.println("Los números son iguales" + " El numero uno es : " + numUno  +" El número dos es : " + numDos);
               
           } else {
               
                              System.out.println("Los números no son iguales"+" El numero uno es :" + numUno  +" El número dos es : " + numDos);
               
           }
           
           
           
           
    }
    
    
    
}
