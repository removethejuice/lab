/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//||
package examen2_diegochavez;

public class metodomatriz {
    
public int [][] matriz;

public  metodomatriz(int [][] matriz){
    
this.matriz= matriz;

}

    public String matriznueva( ) {
        String acumulador = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int w = 0; w < matriz.length; w++) {
                if (i==w || i+w==matriz.length-1){
                 if(primo(matriz[i][w])){
                 
                 matriz [i][w]= -1;
                 }
                 else {
                 matriz [i][w]=0;
                 }
                
                }
                
                acumulador = acumulador + matriz [i][w];
                acumulador = acumulador +"   ";
                
            }
            acumulador = acumulador+"\n";
        }// fin del primer for
                return acumulador;
            }// fin del segundo for

    

    public boolean primo(int numero) {
        int contador = 0;
        boolean bandera = true;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            bandera = false;

        }
        return bandera;
    }

}
