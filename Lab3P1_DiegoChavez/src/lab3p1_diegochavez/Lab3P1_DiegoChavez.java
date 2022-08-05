/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p1_diegochavez;
import java.util.Scanner;
/**
 *
 * @author 50497
 */
public class Lab3P1_DiegoChavez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea= new Scanner(System.in);
        boolean bandera = true;
        while (bandera==true){
        System.out.println("Seleccione una opcion del menu");
        System.out.println("1) Sumatoria");
        System.out.println("2) Formula de David");
        System.out.println("3) Forma");
        System.out.println("4) Salir");
        int opcion_menu = lea.nextInt();
        switch (opcion_menu) {
        
            case 1:
                boolean bandera2 = true;
                while (bandera2==true){
                bandera2 = false;
                System.out.println("Proporcione un numero del 1-10 para la sumatoria");
                int numero = lea.nextInt();
                double factorial=0;
                double factorial2= 0;
                double contador =0;
                double contador2=1;
                if (numero < 0 || numero > 10){
                bandera2 = true;
                }//fin del if
                if (bandera2 == false){
                    
                for(int i = 1;i<=5; i++){
                factorial=2*i;
                factorial2= factorial;
                contador2=1;
                for (int w=0;w< factorial/2;w++){
                contador2= factorial2*(factorial2-1)*contador2;
                factorial2=factorial2-2;
                
                }// fin del segundo for
                
                
                contador = ((Math.pow((-1),i))*(Math.pow(numero,(2*i+1)))*contador2)/((Math.pow(4,i))*(2*i+1))+contador-numero;
                
                        
                }// fin del primer for
                System.out.println(contador); 
                
                
                
                
                }// fin del if
                }// fin del primer while
                break;
        
        
        
                
            case 2: 
                bandera2 = true;
                int contador=0;
                while (bandera2==true){
                bandera2 = false;
                System.out.println("Introduzca un numero entero mayor o igual a 2");
                float numero = lea.nextFloat();
                if ( numero <= 1 || numero%1 != 0){
                bandera2 = true;}
                if (bandera2== false){
                while(numero!=1){
                if (numero%2==0){
                numero=numero/2;
                }
                else{
                numero= 3*numero+1;
                }
                contador++;
                }// fin del while
                System.out.println("El numero de iteraciones es: ");
                System.out.println(contador);
                
                }
                
                
                }
                
                
                break;
                
              
            case 3:
                bandera2 = true;
                contador=0;
                while (bandera2==true){
                bandera2 = false;
                System.out.println("Introduzca un numero entero mayor o igual a 4");
                float numero = lea.nextFloat();
                float numero2= numero;
                if ( numero < 3 || numero%1 != 0){
                bandera2 = true;}
                if (bandera2== false){
                    for (int z=0;z<=numero;z++){
                    for (int q=contador;q>0;q--){
                    System.out.print("*");
                    
                    }//final del segundo for
                    System.out.print("-");
                    for (float o= numero2 -1;o>=0;o--){
                    System.out.print("+");}// final del 3er for
                    contador++;
                    numero2--;
                    System.out.println();
                    }// final del primero for
                    
                    
                    
                    
                }// fin del if
                }// fin del while
                
            
                
                
                break;
                
            case 4:
                bandera=false;
                break;
            case 5:
                int numero = lea.nextInt();
                int factorial= numero;
                int contadorz=1;
                for (int i=0;i< numero/2;i++){
                contadorz= factorial*(factorial-1)*contadorz;
                factorial=factorial-2;
                System.out.println(contadorz);
                }
                
                break;
                
            default:
                break;
               
        }// fin del switch
        }//fin del while
        
        
    }// fin del programa
    
}
