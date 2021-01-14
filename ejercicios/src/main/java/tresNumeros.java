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
public class tresNumeros {
    
    
    
    public static void main(String[] args) {
        
        int numUno;
        int numDos;
        int numTres;
        
        Scanner entradaDato = new Scanner(System.in);
        
        
        System.out.println("Ingresa Numero Uno");
        
       numUno = entradaDato.nextInt();
        
        System.out.println("Ingresa Numero Dos");
        
        numDos = entradaDato.nextInt();
        
        System.out.println("ingresa Numero Tres");
        
        numTres = entradaDato.nextInt();
        
        
        if ( numUno > numDos && numDos > numTres ) {
            
            System.out.println( numUno + numDos + numTres);
            
        } 
        
        if (numUno > numTres && numTres > numDos) {
            
            
            System.out.println(numUno + "" + numTres + "" + numDos);
            
        }
        
        if (numDos > numUno  && numUno > numTres) {
            
            System.out.println(numDos + "" + numUno + "" + numTres);
            
        }
        
         if (numDos > numTres  && numTres > numUno) {
            
              System.out.println(numDos + "" + numTres + "" + numUno);
             
        }
         
         if (numTres > numUno && numUno> numDos) {
             
             System.out.println(numTres + "" + numUno + "" + numDos);
            
        }
         
         if (numTres > numDos && numDos> numUno) {
             
             System.out.println(numTres + "" + numDos + "" + numUno);
            
        }
        
    }
    
}
