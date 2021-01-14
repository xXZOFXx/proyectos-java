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

public class circulo {
    
    public static void main(String[] args) {
        
        //entrada declaración de variables
        
        
       float radio;
       int area;
     
        
        
        Scanner entradaDato = new Scanner(System.in);
        System.out.println("Bienvenido al programa para capturar el area de uncirculo, por favor digita el radio");
        
        radio = entradaDato.nextFloat();
        
        
        //proceso
        
         area =(int) (Math.PI*(radio*radio)); 
         
         System.out.println(" El area del circulo es : " + area);
        
        
    }
    
    
    
}
