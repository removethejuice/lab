/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegochavez;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class Examen2_DiegoChavez {

    static Scanner lea = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Declare el tamanio de la matriz cuadrada:");
        int tamanio = lea.nextInt();
        int[][] matriz = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int w = 0; w < tamanio; w++) {
                matriz[i][w] = 1 + rand.nextInt(50);

            }

        }
        metodomatriz met = new metodomatriz(matriz);
        JOptionPane.showMessageDialog(null, met.matriznueva());

        System.out.println("Declare la cadena:");
        String cadena = lea.next();

        metodocadenas met2 = new metodocadenas(cadena);
        boolean bandera2 = met2.leer();
        if (bandera2 == true) {
            System.out.println("Vocales seguidas");
        } else {

            System.out.println("Vocales NO seguidas");
        }
       

    }// fin del main

}
