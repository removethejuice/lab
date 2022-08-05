/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p1_diegochavez;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab9P1_DiegoChavez {

    static Scanner lea = new Scanner(System.in);
    static Random rand = new Random();
    static Libreria lib = new Libreria();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean bandera = true;
        while (bandera == true) {
            System.out.println("");
            System.out.println("1) Ejercicio 1 Libreria ");
            System.out.println("2) Ejercicio 2 Gusanito ");
            System.out.println("3) Salir ");
            int opcion_menu = lea.nextInt();
            switch (opcion_menu) {

                case 1:
                    ArrayList<String> titulo = new ArrayList();
                    ArrayList<String> autor = new ArrayList();
                    boolean bandera3 = true;
                    while (bandera3 == true) {
                        System.out.println("Seleccione una opcion: ");
                        String agtitulo = "";
                        String agautor = "";
                        int opcion = lea.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Agregue el titulo");
                                lea.nextLine();
                                agtitulo = lea.nextLine();
                                titulo.add(agtitulo);
                                System.out.println("Agregue el autor");
                                agautor = lea.nextLine();
                                autor.add(agautor);

                                break;

                            case 2:
                                System.out.println("Que titulo desea remover?");
                                int opcionborrar = lea.nextInt();

                                while (opcionborrar < 0 || opcionborrar >= autor.size()) {
                                    System.out.println("Seleccione una opcion: ");
                                    opcionborrar = lea.nextInt();
                                }

                                titulo.remove(opcionborrar);
                                autor.remove(opcionborrar);

                                break;
                            case 3:
                                int opcion2 = 0;

                                System.out.println("Seleccione una opcion: ");
                                opcion2 = lea.nextInt();
                                while (opcion2 < 0 || opcion2 >= autor.size()) {
                                    System.out.println("Seleccione una opcion: ");
                                    opcion2 = lea.nextInt();
                                }
                                System.out.println(autor.get(opcion2));
                                System.out.println(titulo.get(opcion2));
                                break;

                            case 4:
                                boolean bandera2 = false;
                                lea.nextLine();
                                String cadena4 = lea.nextLine();
                                for (int i = 0; i < titulo.size(); i++) {
                                    if (titulo.get(i).equals(cadena4)) {
                                        i = titulo.size();
                                        bandera = true;
                                    }
                                }
                                if (bandera == true) {
                                    System.out.println("El libro esta");
                                } else {
                                    System.out.println("El libro NO esta");
                                }
                                break;
                            case 5:
                                bandera3 = false;
                                System.out.println("Adios");
                                break;
                        }// fin del segundo switch
                    }// fin del segundo while
                case 2:
                    String instrucciones ="";
                    System.out.println("Proporcione las filas");
                    int m = lea.nextInt();
                    System.out.println("Proporcione las columnas");
                    int n = lea.nextInt();

                    while (m > 10 || m < 4) {
                        System.out.println("Proporcione las filas");
                        m = lea.nextInt();
                    }

                    while (n > 10 || n < 4) {
                        System.out.println("Proporcione las filas");
                        n = lea.nextInt();
                    }
                    Gusanito gus = new Gusanito(m, n);
                    while (gus.mover(cordxgus,cordygus,co))// quiero repetir el enviar las instrucciones mientras la bandera no sea true luego convertir las instrucciones en cordxgus + lo que se movio
                    instrucciones = lea.next();
                    
                    

                    break;

                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");

            }// fin del switch

        }// fin del while

    }// fin del main
}// fin del class
