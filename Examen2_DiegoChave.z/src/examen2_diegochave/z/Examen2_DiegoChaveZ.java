package examen2_diegochave.z;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Examen2_DiegoChaveZ {
    // now let's see paul allen's exam

    static Scanner lea = new Scanner(System.in);
   
    

    public static void main(String[] args) {

        boolean bandera = true;
        while (bandera == true) {
            String opcion_menu = JOptionPane.showInputDialog("Seleccione una opcion del menu: \n 1) Ejercicio 1  \n 2) Ejercicio 2");
            switch (opcion_menu) {
                case "1":
                    boolean bandera2 = true;
                    String problema ="";
                    while (bandera2 == true) {
                        bandera2 = false;
                        System.out.println("Proporcione una cadena para realizar el ejercicio  debe de contener solamente 4 elementos y todos deben de ser numeros");
                        problema = lea.next();

                        if (problema.length() != 4) {
                            bandera2 = true;
                        }

                          for (int i = 0; i < problema.length(); i++) {

                            if (problema.charAt(i) != '0' && problema.charAt(i) != '1' && problema.charAt(i) != '2' && problema.charAt(i) != '3' && problema.charAt(i) != '4' && problema.charAt(i) != '5' && problema.charAt(i) != '6' && problema.charAt(i) != '7' && problema.charAt(i) != '8' && problema.charAt(i) != '9') {
                                bandera2 = true;
                            }
                        }// fin del for
                         
                                                   
                    }// fin de la validacion
                    Kaprekar met = new Kaprekar(problema);
                    
                    ArrayList<String> ultimolistado  = new ArrayList ();
                   met.imprimirlista(met.listado2());
                    
                    
                    
                    break;
                    
                case "2":
                    System.out.println("Proporcione el tamanio de la matriz");
                    int tamanio = lea.nextInt();
                    while (tamanio < 3 && tamanio>9){
                    
                    System.out.println("Proporcione el tamanio de la matriz de 3-9 !");
                    tamanio = lea.nextInt();
                    }
                    
                    metodoejercicio2 met2 = new metodoejercicio2(tamanio);
                    
                     met2.imprimirmatriz(met2.matriz());
                    
                    break;
                    
 
                     

                     
                default:
                    System.out.println("Seleccione una opcion correcta");
                    break;
            }// fin del switch
        }// fin del while
    }// fin del main

}
