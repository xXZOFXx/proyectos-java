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

public class longitud {
    
    //pedir el radio de una circunferencia y calcular su longitud
    public static void main(String[] args) {
        
        
        //entrada declaración de variables
        double radio;
        
         Scanner entradaDato = new Scanner (System.in);
        System.out.println("Bienvenido a calcular longitud  de un circulo, por favor ingresa el radio:");
        
             radio = entradaDato.nextDouble();
             
             //proceso 
             
             double longitud = radio * 2 * Math.PI;
             
             System.out.println("La langitud del circulo es : " + longitud);
        
        
        }
    }

