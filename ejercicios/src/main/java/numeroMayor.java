/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e-zof
 */

//Pedir dos números y decir cual es el mayor y si son iguales descirlo

import java.util.Scanner;




public class numeroMayor {
    
    public static void main(String[] args) {
        
        //entrada declaracion de variables
        
        int numUno;
        int numDos;
        
        Scanner entradaDato = new Scanner(System.in);
        
        
        System.out.println("Digite número Uno");
        numUno = entradaDato.nextInt();
        
        System.out.println("Digite número dos");
        
        numDos = entradaDato.nextInt();
         //proceso
        if ( numUno > numDos ) {
            
            System.out.println( numUno + " Es el número mayor");
            
        }else if(numUno == numDos){
        
            System.out.println( numUno + " & " + numDos + " son iguales");
        
        } else  {
            
            
            System.out.println( numDos + " Es el número mayor ");
            
        }
        
        
       
        
        
        //salida
        
        
    }
    
    
}
