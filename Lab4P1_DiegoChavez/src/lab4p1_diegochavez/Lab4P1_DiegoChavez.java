/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p1_diegochavez;
import java.util.Scanner;
/**
 *
 * @author 50497
 */
public class Lab4P1_DiegoChavez {
 static Scanner lea= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
      
        boolean bandera = true;
        while (bandera==true){
        System.out.println("Seleccione una opcion del menu");
        System.out.println("1) Descomponer cadenas en numero");
        System.out.println("2) Contador de vocales");
        System.out.println("3) Palindromos");
        System.out.println("4) Salir");
        int opcion_menu = lea.nextInt();
        switch (opcion_menu) {
            
            case 1:
                System.out.println("Seleccione una cadena para sumar sus valores numericos ");
                String cadena = lea.next();
                String cadena2 = "";
                char letra =0;
                int contador = 0;
                int contadorz = 0;
                for(int i =0; i< cadena.length();i++){
                contadorz = (int) cadena.charAt(i);
                
                System.out.print(contadorz +" - ");
                contador = contador + contadorz; 

                
                
                }
                 System.out.println("La suma de los caracteres es: "+ contador);
                 if (contador%2==0){
            System.out.println("La suma es par");
            
                 }
                 else{
                 System.out.println("La suma no es par");
                 }
                break;
                
                
            case 2: 
                 System.out.println("Seleccione una cadena para mirar cuantas vocales tiene ");
                cadena = lea.next();
                cadena = cadena.toLowerCase();
                cadena2 = " " ;
                 letra =0;
                 contador=0;
                 for(int i =0; i< cadena.length();i++){
                 letra = cadena.charAt(i);
                 if(letra == 'a' || letra == 'e' ||  letra == 'i' || letra =='u' || letra =='o'){
                      cadena = cadena.replace(letra,'*');
                      contador++;
                      cadena2= cadena2+letra;
                 }// fin del if
                 } // fin del for
                 if (contador==5){
                 System.out.println("Estan todas las vocales");
                 }
                 else{
                 System.out.println("Estan solo las vocales:  " + cadena2);
                 }
                 
                
                break;
            
            case 3:
                 System.out.println("Seleccione una cadena para ver si es un palindromo");
                cadena = lea.next();
                cadena = cadena.toLowerCase();
                cadena2 = "";
                letra = 0;
                for(int i = cadena.length()-1; i>=0;i--){
                 letra = cadena.charAt(i);
                 cadena2 = cadena2 + letra;
                 
                }
                if (cadena2.equals(cadena)){
                System.out.println(" Es un palindromo");
                }
                else {
                System.out.println(" No es un palindromo");
                }
                
                break;
            
                                          
            
            case 4:
                bandera=false;
                break;
       
                
                
                
            default:
                break;
        }
        
        }  
        
    }
    
}
