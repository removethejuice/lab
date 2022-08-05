/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p1_diegochavez;

import static lab8p1_diegochavez.Lab8P1_DiegoChavez.rand;

/**
 *
 * @author 50497
 */
public class metodosdematrices {

    public static int[][] lectura(int filas, int columnas, int rango, int valor) {
        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = valor + rand.nextInt(rango);

            }// fin del segundo for  
        }// fin del for

        return matriz;
    }// fin del metodo lectura

    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < 10) {
                    System.out.print(matriz[i][j] + "    ");
                } else {
                    System.out.print(matriz[i][j] + "   ");
                }

            }// fin del segundo for  
            System.out.println();
        }// fin del for
        System.out.println();
    }// fin de imprimir

    public static int[] mayor(int[][] matriz) {
        int mayor = 0;
        int arreglo[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            mayor = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }// fin del segundo for
            arreglo[i] = mayor;
        }// fin del primer for

        return arreglo;
    }

    public static void imprimirarreglos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "   ");
        }// fin del for

    }// fin de imprimir arreglos

    public static int suma(int[][] matriz) {
        int numero1 = 0;
        int numero2 = 1;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || j == 0 || i == matriz.length - 1 || j == matriz[i].length - 1) {
                    numero1 += matriz[i][j];
                }// fin del if
                else {
                    numero2 *= matriz[i][j];
                    contador++;

                }
            }// fin del segundo for
        }// fin del primer for
        if (contador == 0) {
            numero2 = 0;
        }

        return (numero1 + numero2);
    }// fin del metodo suma

    public static int[][] darvuelta(int[][] matriz) {
        int matriz2[][] = new int[matriz[0].length][matriz.length];
        int contador1 = 0;
        int contador2 = 0;
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = 0; j <= matriz[i].length - 1; j++) {
                matriz2[contador2][contador1] = matriz[i][j];
                contador2++;

            }
            contador2 = 0;
            contador1++;
        }

        return matriz2;

    }// fin del metodo 90grados

    
    public class int [][] ordenarmatrices (int [][] matriz){
        
    		for( int i=0; i < matriz.length; i++){//ordena la matriz de abajo hacia arriba

			for( int j=0;j< matriz[i].length; j++){

			for(int x=0; x < matriz.length; x++){

				for(int y=0; y <matriz[x].length; y++){

			if(matriz[i][j] > matriz[x][y]){

			t = matriz[i][j];

			matriz[i][j] = matriz[x][y];

			matriz[x][y] = t;

			}

				}

			}

			}

	    }System.out.println("******************************************************");

		for ( i=mat.length-1;i>=0;i--){//imprime la matriz ascendentemente

			for( j=mat.length-1;j>=0;j--){

				System.out.print(mat[i][j]+"	");

			}

			System.out.println("");

		}

 

	}
    
    
    }
}
