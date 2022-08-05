/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2fordiegochavez12211369;
import java.util.Scanner;
/**
 *
 * @author 50497
 */
public class Proyecto2ForDiegoChavez12211369 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        boolean bandera = true;
        Scanner lea= new Scanner(System.in);
        while (bandera==true){
            
        
        System.out.println(" ");
        System.out.println("1) Sacar el maximo comun denominador de un entero ");
        System.out.println("2) Calcular la inflacion promedio por anio, considerando una inflacion anual del 2% ");
        System.out.println("3) Salir ");
        System.out.println("4) Triangulo rectangulo de asteriscos ");
        System.out.println("5) Triangulo rectangulo de asteriscos, pero al reves ");
        int opcionMenu = lea.nextInt();
        switch (opcionMenu){
        
            case 1:
                System.out.println("Proporcione un numero entero para sacar su maximo comun denominador: ");
                int numero = lea.nextInt();
                int a=0;
                if (numero <0){
                numero = numero*-1;}
                for(int i=1; i<=numero; i++){
                    if (numero%i ==0 && i!= numero){
                    a=i;
                    }}
                System.out.println(" El maximo comun denominador es: " );
                System.out.println(a);                
                
                
                break;
            case 2:
                
                boolean bandera2= true;
                while (bandera2==true){
                    bandera= false;
                   float contador =1; 
                System.out.println(" Proporcione el anio de inicio para calcular la inflacion promedio " );
                int anio = lea.nextInt();
                System.out.println(" Proporcione el anio del final para calcular la inflacion promedio " );
                int aniofinal = lea.nextInt();
                System.out.println(" Proporcione el dinero de inicio para calcular la inflacion promedio " );
                float dinero = lea.nextInt();
                if(anio<0 || aniofinal<anio || dinero<0){
                bandera2 = true;
                }
                
                if (bandera2== false){
                for (int anio2 = anio; anio2 <= aniofinal; anio2++){
                contador= (float) (1.02*contador);
                }}
                System.out.println(contador);
                System.out.println(" Es el multiplo que valdria su dinero sin la inflacion"); 
                System.out.println(contador*dinero);
                System.out.println(" Es lo que vale su dinero ahora en el anio");
                System.out.println(aniofinal);
                    } bandera2= true; // fin del while
                break;
            case 3:
                bandera= false;
                System.out.println("Adios");
                break;
                
            case 4:
                bandera2= true;
                while (bandera2==true){
                System.out.println("Proporcione la altura");
                int altura= lea.nextInt();
                if (altura>0){
                    bandera2=false;}
                if (bandera2==false){
                for(int i= 0; i<=altura;i++ ){
                    System.out.println();
                    for (int w=0;w<=i;w++){
                    System.out.print("*");
                    }
                }}//fin del if
                altura=0;
               }
               
                break;
            case 5:
                bandera2=true;
                while (bandera2 ==true){
                 System.out.println("Proporcione la altura");
                int altura2 = lea.nextInt();
                if (altura2>0){
                bandera2 = false;}
                if(bandera2==false){
                for(int r= altura2; r>=0;r-- ){
                    System.out.println();
                    for (int w=r;w>=0;w--){
                    System.out.print("*");
                    }
                } }//fin del if
                
                altura2=0;} // fin del while
                
                break;
                
            case 6:
                bandera2=true;
                while (bandera2 ==true){
                 System.out.println("Proporcione la altura");
                int altura2 = lea.nextInt();
                int contadorx=altura2;
                if (altura2>0){
                bandera2 = false;}
                if(bandera2==false){
                for(int r= 0; r<=altura2;r++ ){
                    System.out.println();
                   
                    for (int w=0;w<=r-1;w++){
                    System.out.print(" ");
                    }
                    if (contadorx>=0){
                    contadorx--;}
                    for (int z=0;z<=contadorx;z++){
                    System.out.print("*");
                    }
                } }//fin del if
                
                altura2=0;}
                break;
                
                   case 7:
                bandera2=true;
                while (bandera2 ==true){
                 System.out.println("Proporcione la altura");
                int altura2 = lea.nextInt();
                int contadorx=altura2;
                if (altura2>0){
                bandera2 = false;}
                if(bandera2==false){
                for(int r= 0; r<=altura2;r++ ){
                    System.out.println();
                   if (contadorx>=0){
                    contadorx--;}
                    for (int z=0;z<=contadorx;z++){
                    System.out.print(" ");
                    }
                    for (int w=0;w<=r-1;w++){
                    System.out.print("*");
                    } 
                } }//fin del if
                altura2=0;}
                
                break;
                
                   case 8:
                bandera2 = true;
                while (bandera2==true){
                    
               System.out.println("Proporcione la altura del cuadrado (debe de ser mayor o igual a 2)");
                int altura = lea.nextInt();
                if (altura>=2){
                bandera2=false;}
                
                for (int i=1;i<=altura;i++){
                if (i==1 || i==altura){
                for(int w=0;w<altura;w++){
                System.out.print("*");
                }}
                else {
                    for (int z=1;z<=altura;z++){
                    if (z==1 || z==altura){
                       System.out.print("*"); 
                    }
                    else{
                    System.out.print(" ");
                    }
                    }
                    
                        }
                System.out.println();
                }//fin del for e if
                }//fin del while
                
                
                
                
                
               break;     
                       
                case 9:
               System.out.println("Introduzca la altura de la piramide ");
               int altura = lea.nextInt();
               for (int i = altura; i>0; i--){
               for (int w =0; w<i; w++){
                System.out.print(" ");
               }
               for (int z=1;z<=2*i+1;z++){
                System.out.print("*");
               }
                System.out.println();
               }
              
                
                break;
               
               
                   case 10:
                       bandera2 = true;
                       while(bandera2== true){
                       System.out.println("Seleccione la altura de su estrella de David (la altura de los triangulos) ");
                       altura = lea.nextInt();
                       if (altura >=3){
                   bandera2= false;
                       }
                       
                       
                       }
                       break;
                
              default:
                System.out.println("Seleccione una opcion valida ");
                
                break;
      
        
        } // fin del switch
        
       
    }// fin del while
    
}}


