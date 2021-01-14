/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e-zof
 */

//pedir dos números y decir si uno es múltiplo del otro


import java.util.Scanner;



public class multiplosNumero {

    public static void main(String[] args) {
        //entrada declaración de variables
        
        int numUno;
        int numDos;
        int resultNumeros;
        int entero;
        
        Scanner entradaDato = new Scanner(System.in);
        
        System.out.println("Bienvenido a la app multiplos, introduce numero uno");
        
        numUno = entradaDato.nextInt();
        
        System.out.println("Introduce número dos");
        numDos = entradaDato.nextInt();
        
        
        //proceso (Resolución del problema)
        
        resultNumeros = numUno % numDos;
        
        if ( resultNumeros == 0 ) {
            
            
            System.out.println("son multiplos");
            
        } else {
            
                        System.out.println("no son multiplos");
            
        }
        
    }

    
}
