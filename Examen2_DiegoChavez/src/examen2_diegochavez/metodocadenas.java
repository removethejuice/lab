/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegochavez;

/**
 *
 * @author 50497
 */
public class metodocadenas {
    
    public String cadena;
    
    public metodocadenas (String cadena){
    this.cadena = cadena;
    }
    
    public boolean leer (){
    boolean bandera = false;
        for (int i=0;i<cadena.length();i++){
        if (cadena.charAt(i)=='a'|| cadena.charAt(i)=='e'|| cadena.charAt(i)=='i'|| cadena.charAt(i)=='o'|| cadena.charAt(i)=='u' ){
            if (i!= cadena.length()-1){
            
         if ((cadena.charAt(i+1)=='a'|| cadena.charAt(i+1)=='e'|| cadena.charAt(i+1)=='i'|| cadena.charAt(i+1)=='o'|| cadena.charAt(i+1)=='u') && i != cadena.length()-1 ){
        bandera = true;
         }
            }
        }// fin del primer if
    
    }// fin del for
    return bandera;
}// fin de leer
}// fin del class