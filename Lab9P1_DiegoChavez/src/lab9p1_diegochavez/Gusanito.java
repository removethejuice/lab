/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p1_diegochavez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static lab9p1_diegochavez.Lab9P1_DiegoChavez.rand;

public class Gusanito {

    public int m;
    public int n;
    public ArrayList<String> instrucciones = new ArrayList();
    public int[][] tablero;
    public int cordxgus;
    public int cordygus;
    public int cordxman;
    public int cordyman;

    public Gusanito(int m, int n) {
        this.m = m;
        this.n = n;

        tablero = new int[m][n];
        cordxgus = rand.nextInt(m);
        cordygus = rand.nextInt(n);
        cordxman = rand.nextInt(m);
        cordyman = rand.nextInt(n);
        tablero[cordxgus][cordygus] = 5;
        tablero[cordxman][cordyman] = 0;
    }

    public ArrayList<String> gettinstrucciones() {
        return instrucciones;
    }

    public void setinstrucciones(ArrayList<String> instrucciones) {
        this.instrucciones = instrucciones;

    }

    public int[][] gettablero() {
        return tablero;
    }

    public void settablero(int[][] tablero) {
        this.tablero = tablero;

    }

    public int getcordxgus() {
        return cordxgus;
    }

    public void setcordxgus(int cordxgus) {
        this.cordxgus = cordxgus;

    }

    public int getcordygus() {
        return cordygus;
    }

    public void setcordygus(int cordygus) {
        this.cordygus = cordygus;

    }

    public int getcordxman() {
        return cordxman;
    }

    public void setcordxman(int cordxman) {
        this.cordxman = cordxman;

    }

    public int getcordyman() {
        return cordyman;
    }

    public void setcordyman(int cordyman) {
        this.cordyman = cordyman;

    }

    public boolean mover(int cordxgus, int cordygus, int cordxman, int cordyman) {
        boolean bandera = false;
        if (cordxgus == cordxman && cordygus == cordyman) {
            bandera = true;
        }

        return bandera;
    }

    public void moverimprimir(int cordxgus, int cordygus, int cordxman, int cordyman) {
        int[][] matriz = new int[m][n];
        matriz[cordxgus][cordygus] = 5;
        matriz[cordxman][cordyman] = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int w = 0; w < matriz[i].length; w++) {
                System.out.print(matriz[i][w]+"   ");

            }// fin del segundo for
            System.out.println();
        }// fin del primer for
    }//  fin del class

}// fin del class
