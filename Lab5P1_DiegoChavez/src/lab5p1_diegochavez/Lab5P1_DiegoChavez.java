
package lab5p1_diegochavez;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 50497
 */
public class Lab5P1_DiegoChavez {
static Random rand = new Random();
  public static int cadenas(String cadena1, String cadena2){
  
      int contador =0;
      int contador2=0;
      int contador3=0;
      char letra =0;
      for (int i =0; i< cadena2.length(); i++){
                     letra = cadena2.charAt(i);
                     
                     for (int w=contador3+1;w< cadena1.length();w++){
                     if (letra == cadena1.charAt(w)){
                     contador++;
                     contador3 =w;     
                     w= cadena1.length();
                     }
                   
                     
                     else {
                     contador =0; 
                     }
                     
                 if(contador == cadena2.length()){
                 contador2 =1;
                 }
                   }// fin del segundo for  
                 }// fin del for
                 
                 System.out.print(contador2);
              
  return contador2;
  }
  public static void substring (int numero, int numero2, String cadena1){
  char letra =0;
  String cadena3="";
  System.out.println("La cadena restante es: " );
  while(numero>numero2){
  letra = cadena1.charAt(numero2);
  cadena3 = cadena3 + letra;
  numero2++;
  }// fin del while
  System.out.print(cadena3);
  
  
  
  
  
  }
  public static double factorial(int n){
      double contador =1;
      int numero = n+3;
                for (int w=0;w< n+3 ;w++){
                contador= numero*contador;
                numero--;      
                }
  
  return contador;
  }// fin de factorial
  
  public static double sumatoria (int x){
      double contador =0;
  for(int i =1; i<=x;i++){
  contador = (factorial(i))/(5*i*i-3*i+1)+ contador;
  }
  return contador;
  }//fin de sumatoria
    
    public static void main(String[] args) {
      Scanner lea= new Scanner(System.in);
      boolean bandera = true;
      boolean bandera2 = true;
      while(bandera == true){
      System.out.println("");
      System.out.println("1) Comparar cadenas ");
      System.out.println("2) Sumatoria ");
      System.out.println("3) Substring ");
      System.out.println("4) Salir ");
      int opcion_menu = lea.nextInt();
      lea.nextLine();
      switch(opcion_menu){
       
          case 1:
              bandera2 = true;
              String cadena1 ="";
              String cadena2 ="";
              char letra =0;
              
              int contador = 0;
              int contador2 =0;
              int contador3 =-1;
              
                 while(bandera2==true){
                     bandera2 = false;
              System.out.println("Proporcione una cadena");
              
              cadena1 = lea.nextLine();
              String cadena3 = cadena1;
              System.out.println("Proporcione la segunda cadena");
              cadena2 = lea.nextLine();
              if(cadena2.length()>cadena1.length()){
              cadena1 = cadena2;
              cadena2 = cadena3;
              }
              if (cadena2.length() == cadena1.length()){
              bandera2 = true;
              }
                 }// fin del while
                 
                 /*for (int i =0; i< cadena2.length(); i++){
                     letra = cadena2.charAt(i);
                     
                     for (int w=contador3+1;w< cadena1.length();w++){
                     if (letra == cadena1.charAt(w)){
                     contador++;
                     contador3 =w;     
                     w= cadena1.length();
                     }
                   
                     
                     else {
                     contador =0; 
                     }
                     
                 if(contador == cadena2.length()){
                 contador2 =1;
                 }
                   }// fin del segundo for  
                 }// fin del for
                 
                 System.out.print(contador2);*/
               int num=  cadenas (cadena1,cadena2);
               if (num ==1){
               System.out.println("CABE ");}
               else{
               System.out.println("NO CABE");}
              break;
          case 2:
              bandera2=true;
              while (bandera2==true){
              System.out.println("Proporcione el limite de la sumatoria ");
              int x = lea.nextInt();
              if(x>0){
              bandera2= false;
              }
              System.out.println(sumatoria(x)+" Es la sumatoria");
              
              }// fin del while
              
              break;
              
          case 3:
              bandera2= true;
              int numero =0;
              int numero2=0;
              int numero3=0;
              cadena1 ="";
              while (bandera2==true){
                  bandera2= false;
              System.out.println("Proporcione la cadena y ambos numeros ");
              
              cadena1 = lea.next();
              numero = lea.nextInt();
              numero3= numero;
              numero2 = lea.nextInt();
              if (numero2>numero){
              numero = numero2;
              numero2= numero3;
              }
              if (numero <0 || numero2 <0 || numero2==numero || numero >= cadena1.length()){
              bandera = true;}
              } // fin del while
              
              
              substring(numero,numero2,cadena1);
              break;
          case 4:
              bandera = false;
              break;
              
              
          default :
              System.out.println("Seleccione una opcion correcta");
              break;
      }// fin del switch
      }// fin del while
      
    }// fin del main
    
}// fin del pubic class
