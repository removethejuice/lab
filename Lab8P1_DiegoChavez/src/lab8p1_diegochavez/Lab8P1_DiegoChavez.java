/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p1_diegochavez;

import java.util.Scanner;
import java.util.Random;

public class Lab8P1_DiegoChavez {

    static Scanner lea = new Scanner(System.in);
    static Random rand = new Random();
    static metodosdematrices met = new metodosdematrices();

    public static void main(String[] args) {
        boolean bandera = true;
        while (bandera == true) {
            System.out.println("");
            System.out.println("1) Ejercicio 1 Elementos mayores de la matriz ");
            System.out.println("2) Ejercicio 2 El numero magico ");
            System.out.println("3) Ejercicio 3  Dar vuelta  ");
            System.out.println("4) Salir ");
            int opcion_menu = lea.nextInt();
            switch (opcion_menu) {

                case 1:
                    int rango = 100;
                    int valor = 1;
                    System.out.println("Seleccione el tamanio de las filas: ");
                    int filas = lea.nextInt();

                    while (filas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las filas: ");
                        filas = lea.nextInt();
                    }

                    System.out.println("Seleccione el tamanio de las columnas: ");
                    int columnas = lea.nextInt();

                    while (columnas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las columnas: ");
                        columnas = lea.nextInt();
                    }

                    int matriz[][] = new int[filas][columnas];
                    matriz = met.lectura(filas, columnas, rango, valor);

                    System.out.println();
                    met.imprimir(matriz);

                    System.out.println("Los elementos mayores de cada fila son:");
                    met.imprimirarreglos(met.mayor(matriz));

                    break;

                case 2:
                    rango = 10;
                    valor = 0;
                    System.out.println("Seleccione el tamanio de las filas: ");
                    filas = lea.nextInt();

                    while (filas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las filas: ");
                        filas = lea.nextInt();
                    }

                    System.out.println("Seleccione el tamanio de las columnas: ");
                    columnas = lea.nextInt();

                    while (columnas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las columnas: ");
                        columnas = lea.nextInt();
                    }

                    int matriz2[][] = new int[filas][columnas];
                    matriz2 = met.lectura(filas, columnas, rango, valor);

                    System.out.println("La matriz");
                    met.imprimir(matriz2);

                    System.out.println(" El numero:" + met.suma(matriz2));

                    break;

                case 3:
                    rango = 10;
                    valor = 0;
                    System.out.println("Seleccione el tamanio de las filas: ");
                    filas = lea.nextInt();

                    while (filas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las filas: ");
                        filas = lea.nextInt();
                    }

                    System.out.println("Seleccione el tamanio de las columnas: ");
                    columnas = lea.nextInt();

                    while (columnas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las columnas: ");
                        columnas = lea.nextInt();
                    }

                    int matriz3[][] = new int[filas][columnas];
                    matriz3 = met.lectura(filas, columnas, rango, valor);

                    System.out.println("La matriz");
                    met.imprimir(matriz3);

                    System.out.println("La matriz dada vuelta: ");
                    met.imprimir(met.darvuelta(matriz3));

                    break;

                case 4:
                    bandera = false;
                    System.out.println(" Adios!");
                    break;
                    
                case 5:
                    rango = 100;
                    valor = 1;
                     System.out.println("Seleccione el tamanio de las filas: ");
                    filas = lea.nextInt();

                    while (filas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las filas: ");
                        filas = lea.nextInt();
                    }

                    System.out.println("Seleccione el tamanio de las columnas: ");
                    columnas = lea.nextInt();

                    while (columnas < 2) {
                        System.out.println("El tamanio no puede ser menor a 2! ");
                        System.out.println("Seleccione el tamanio de las columnas: ");
                        columnas = lea.nextInt();
                    }
                    
                    int matriz4 [][] = new int [filas][columnas];
                    
                    break;

                default:
                    System.out.println("Ingrese una opcion adecuada!");
                    break;

            }// fin del switch

        }// fin del while

    }// fin del main

}// fin del class
