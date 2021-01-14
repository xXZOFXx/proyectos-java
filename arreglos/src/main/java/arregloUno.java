/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e-zof
 */
public class arregloUno {

    public static void main(String[] args) {

        int arrayA[] = {1, 2, 3};
        int arrayB[] = {4, 5, 6};
        int arregloC[] = {7, 8, 9};

        int arrayC[] = new int[9];

        for (int i = 0; i < 3; i++) {
            arrayC[i] = arrayA[i];
            arrayC[i + 3] = arrayB[i];
            arrayC [i + 3] = arregloC[i];
        }

        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }

    }

}
