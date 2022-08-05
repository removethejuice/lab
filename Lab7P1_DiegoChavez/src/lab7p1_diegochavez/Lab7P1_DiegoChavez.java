/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p1_diegochavez;

import java.util.Scanner;
import java.util.Random;

public class Lab7P1_DiegoChavez {
    
static Scanner lea = new Scanner (System.in);
static Random rand = new Random();
static clase1 clas = new clase1();


    public static int [] arreglos2 (int [] arreglo3, int valor){
        int numero1 = arreglo3 [0]+arreglo3 [1];
        int numero2 =0;
        int numero3 = 0;
        int arreglo1[] = new int [2];
        for (int i =0; i< arreglo3.length; i++){

            for (int w =0; w < arreglo3.length; w++){
                if (numero1 > Math.abs(valor - arreglo3[w] - arreglo3 [i]) && w!=i ){
                    numero1= Math.abs(valor - arreglo3[w] - arreglo3 [i]) ;
                    numero2 = arreglo3 [w];
                    numero3 = arreglo3 [i];
                } // fin del if
            }// fin del segundo for

        }// fin del primer for
        arreglo1[0]= numero3;
        arreglo1[1]= numero2; 


        return arreglo1;
    } // fin de arreglos2

    public static int [] lectura (int tamanio){
        int arreglo [] = new int [tamanio];
        for (int i =0; i< tamanio; i++){
            arreglo[i]=1+rand.nextInt(10);

        }


        return arreglo;
    }// fin de lectura

    public static void imprimir (int [] arreglo){
            System.out.println("El arreglo ");
        for (int i =0; i< arreglo.length; i++){
        System.out.println(arreglo[i]);
        }

    }// fin de imprimir

    public static void arreglos ( int [] arreglo3 , int [] arreglo4){
        int arreglo5 [] = new int [arreglo3.length];
        int temp =0;
        int contador =0;
        int contador2 =0;
        for (int i =0; i < arreglo3.length; i++){
          temp = arreglo3[i];
            for (int z =0; z< arreglo3.length; z++){

                if (arreglo3 [i] == arreglo5 [z]){
                    z = arreglo3.length;
                    temp =0;
                    }// fin del if

                }// fin del for

            for (int w =0; w< arreglo3.length; w++){
                if (arreglo4[w]== temp){
                    arreglo5 [w] = temp;
                    w = arreglo3.length;
                } // fin del if

            }// fin del segundo for

        }// fin del primer for
        for (int p =0; p< arreglo3.length; p++){
            if (arreglo5 [p]!=0){
                contador++;
            }// fin del if

        }// fin del for

        int arreglo6[]= new int [contador];

        for (int e =0; e< arreglo3.length; e++){
            if (arreglo5 [e]!=0){
                arreglo6 [contador2] = arreglo5 [e];
                contador2++;
            }// fin del if

        }// fin del for
        if (contador ==0){
            System.out.println("Los arreglos no tienen elementos en comun!");
        }
        else {
            System.out.println("Arreglo con elementos en comun: ");
            imprimir(arreglo6);
        }


    }// fin del metodo arreglos

    public static boolean login (String [] arreglo , int [] arreglo2){
        boolean bandera = true;
        System.out.println("Seleccione su ID: ");
        String ID = lea.next();
        System.out.println("Seleccione su contrasenia: ");
        int contra = lea.nextInt(); 

        for (int i =0; i <arreglo.length; i++){
            if (arreglo[i].equals(ID)){

                if (arreglo2[i]==contra){
                bandera = true;
                i = arreglo.length;
                }// fin del segundo if

                 else {
                 bandera = false;
                 i = arreglo.length;
                 }// fin del else


            }// fin del primer if

            else if (i == arreglo.length -1 ){
                bandera = false;
            }// fin del else if

        }// fin del for


        return bandera;
    }// fin de login

    public static void main(String[] args) {
        System.out.println(clas.metodo());
         boolean bandera = true;
        while (bandera == true){
        System.out.println("");
        System.out.println("1) Ejercicio 1 Retornar arreglo cuya suma es mas cercana al valor ");
        System.out.println("2) Ejercicio 2 Login ");
        System.out.println("3) Ejercicio 3 Interseccion de los elementos de dos  ");
        System.out.println("4) Salir ");
        int opcion_menu = lea.nextInt();
        switch (opcion_menu){
        
            case 2:
                
                String arreglo [] = {"1234","000","123456", "898989", "9669" };
                int arreglo2 [] = {1234,000,123456, 898989, 9669};
                
                boolean bandera2 = login (arreglo, arreglo2);
                if (bandera2 == true){
                    System.out.println("Exito!");
                }// fin del if
                
                else {
                 System.out.println("Contrasenia o ID incorrecto.");
                }
                
                break;
            
                
            case 3:
                
                int tamanio =0;
                
                while (tamanio <3){
                    System.out.println("Seleccione el tamanio de los arreaglos: ");
                    tamanio = lea.nextInt();
                    
                    }
                
                int arreglo3 [] = new int [tamanio];
                
                int arreglo4 [] = new int [tamanio];
   
                arreglo3 = lectura(tamanio);
                arreglo4 = lectura(tamanio);

                imprimir(arreglo3);
                imprimir(arreglo4);
                
                arreglos(arreglo3, arreglo4);
                break;
                
                
            case 1:
                tamanio =0;
                int valor =0;
                while (tamanio <=0){
                    System.out.println("Seleccione el tamanio de los arreaglos: ");
                    tamanio = lea.nextInt();
                    
                    }// fin del while
                 arreglo3 = lectura(tamanio);
                 imprimir (arreglo3);
                 
                   while (valor <=0){
                    System.out.println("Seleccione el valor a elegir ");
                    valor = lea.nextInt();
                    
                    }// fin del while
                
                
                imprimir( arreglos2(arreglo3, valor) );
                
                break;
                
                
            case 4:
                System.out.println("Adios");
                bandera = false;
                break;
                
                
            default:
                System.out.println("Seleccione una opcion adecuada!");
                break;
        
        }// fin del switch
        
        }// fin del while
       
        
        
    }// fin del main
    
}// fin del class
