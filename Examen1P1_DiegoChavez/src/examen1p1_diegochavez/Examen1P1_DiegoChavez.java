
package examen1p1_diegochavez;
//    || OR NO BORRAR
import java.util.Scanner;
import java.util.Random;
public class Examen1P1_DiegoChavez {

    static Scanner lea = new Scanner (System.in);
    static Random rand = new Random();
    
    
    public static String cadena1 (double limite){
    String cadena = "";
    char numero =0;
    while (limite!=0){
    int random = 1+rand.nextInt(57);
    if (random >= 48){
    numero = (char) random;
    cadena = cadena + numero;
    limite--;}
    }// fin de cadena1
    
    return cadena;}// fin de cadena1
    
    public static char caracter1 (){
    int numero =0;
    char letra =0;
    boolean bandera2 = true;
    boolean bandera = true;
    while(bandera == true && bandera2 == true){
    System.out.println("Ingrese un numero del 1-9");
    letra = lea.next().charAt(0);
    numero = (int) letra;
    if (numero>=48 || numero<=57 ){
    bandera = false;}
    else {
    bandera2=false;}
    }
    
    return letra;}// fin del caracter1
    
    public static String cadena2 (String cadena1, String cadena2, char caracter1){
 
    String cadena ="";
    for (int i=0;i<cadena1.length();i++){
    if(cadena1.charAt(i)==caracter1){
    cadena = cadena + caracter1;
    }// fin del if
    else if (cadena2.charAt(i)!='*'){
    cadena = cadena + cadena2.charAt(i);
    }
    else {
    cadena= cadena + "*";
    }// fin del else
    }// fin del for
    
    
    return cadena;}// fin de cadena 2
    
  
     public static double exponente (double base, double potencia){
     double exponente1 =1.0;
     while(potencia !=0.0){
     exponente1 = base*exponente1;
     potencia--;
     }
     
     return exponente1;} // fin de exponente
     
     
     
     
     
     
     public static double factorial (double entero){
     double factorial =1;
     
     while(entero>1){
     factorial = entero*factorial;
     entero--;
     }
     
     return factorial;}// fin de factorial
             
    
    
    
    public static void main(String[] args) {
        boolean bandera = true;
        while (bandera == true){
        System.out.println("");
        System.out.println("1) Ejercicio 1");
        System.out.println("2) Ejercicio 2");
        System.out.println("3) Salir ");
        int opcion_menu = lea.nextInt();
         

        switch (opcion_menu){
            case 1:
                double limite =0;
                String cadena = "";
                String cadena2 ="";
                String cadena3 ="";
                int w1 =1;
                
                char letra = 0;
                while (limite <3 || limite >6 ){
                System.out.println("Seleccione el tamanio de la cadena, minimo de 3 mayor de 6");
                limite = lea.nextDouble();
                }
             for (int i =0; i<limite; i++){
             cadena2 = cadena2+"*";
             }
             
             cadena = cadena1(limite);
             System.out.println(cadena);
             
             for (int w =1; w <=10; w++){
                
                letra = caracter1();
            
                cadena2 = cadena2(cadena ,cadena2,letra )  ;
                if(cadena3.equals(cadena2)){
                    }
                else {w--;}
                cadena3 = cadena2;
                
                System.out.println (cadena2);
                System.out.println("Ha hecho " + w1 + " intentos" + " Le quedan "+(10-w)+" intentos");
              
                if (cadena2.equals(cadena)){
                w=10;
                System.out.println("Excelente, adivino la cadena! La cadena es: "+ cadena);
                }
                else  if (w==10){
                System.out.println("Ha fallado sus 10 intentos la cadena es:  "+ cadena );
                }
                w1++;
             }
                
                
                break;
                
            case 2:
                 int limite2 = -1;
                double sumatoria =0.0;
                 
                while (limite2 <0 ){
                System.out.println("Elija el limite de la funcion, debe de ser mayor o igual a 0! ");
                limite2 = lea.nextInt();
                } // fin del while
                 
              
               for (int i =0; i<=limite2;i++){
                          
            sumatoria = ( factorial(4*i) *(1103+26390*i) )/(  (exponente(factorial(i), 4 ))*(exponente(396, 4*i ) ) ) +sumatoria ;
      
                 }
               sumatoria = sumatoria *2*  java.lang.Math.sqrt(2)/9801;
                
                System.out.println("La sumatoria es: " + 1/(sumatoria) );
                break;
            case 3:
                bandera = false;
                break;
            default :
                System.out.println("Elija una opcion adecuada!");
        break;
         
        } // fin del switch
        
        } // fin del while
    }// fin del main
    
}// fin del class
