/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e-zof
 */
public class objetos {
    
    
    
    //metodo
    public static void main(String[] args) {
        
        cocina tradicional = new cocina();
        
        
            tradicional.platos = 15;
            
            tradicional.estufa = 1;
            
            tradicional.lavaManos = 1;
            
            tradicional.colorCocina = " azul";
            
            tradicional.micrOndas = 1;
            
        
        cocina fashion = new cocina();
        
        
        fashion.platos = 40;
        
        fashion.estufa = 2;
        
        tradicional.lavaManos = 2;
        
        tradicional.colorCocina = " papel tapiz  gris claro";
        
        tradicional.micrOndas = 2;
        
        
         System.out.println(" Los platos de una cocina tradicional son  " + tradicional.platos + " las estufas son "+ tradicional.estufa
               
                + " los lavamanos son " + tradicional.lavaManos + " El color de la cocina es " + tradicional.colorCocina + " y los mircondas son " + tradicional.micrOndas);
        
        
        
        System.out.println(" Los platos de una cocina fashion son  " + fashion.platos + "las estufas son "+ fashion.estufa
               
                + " los lavamanos son " + fashion.lavaManos + " El color de la cocina es " + fashion.colorCocina + " y los mircondas son " + fashion.micrOndas);
        
        
        
    }
    
    
}
