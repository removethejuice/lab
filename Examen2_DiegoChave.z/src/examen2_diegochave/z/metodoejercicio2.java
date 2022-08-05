/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegochave.z;

import java.util.Random;

public class metodoejercicio2 {

    Random rand = new Random();
    int tamanio;

    public metodoejercicio2(int tamanio) {
        this.tamanio = tamanio;
    }

    public char[][] matriz() {
        int num = 0;
        char[][] matriz1 = new char[tamanio + 1][tamanio + 1];

        for (int i = 0; i < matriz1.length; i++) {
            for (int w = 0; i < matriz1.length; w++) {

                if (w == 0 || i == 0 && w!=i) {
                    if (i == 0) {
                        matriz1[i][w] =  (char) (97 + w);
                    }// fin del 2ndo if
                }// fin del primer if
                else {
                    matriz1[i][w] =  (char) (97 + w);
                }// fin del else

                if (w != 0 && i != 0) {
                    num = rand.nextInt(50);

                    if (num % 2 == 0) {
                        matriz1[i][w] = '0';

                    }// fin del if
                    else {
                        matriz1[i][w] = '1';
                    }// fin del else
                }
            }// fin del segundo for

        }// fin del primer for

        return matriz1;
    } // fin de matriz

    public void imprimirmatriz(char[][] matriz1) {

        for (int i = 0; i < matriz1.length; i++) {
            for (int w = 0; w < matriz1.length; w++) {
                
                System.out.print(matriz1);
            }// fin del 2ndo for
            System.out.println();

        }// fin del primer for
    }
}//  fin del class
