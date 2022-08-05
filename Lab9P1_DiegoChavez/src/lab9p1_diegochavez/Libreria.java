/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p1_diegochavez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Libreria {
    public ArrayList<String> titulo = new ArrayList();
    public ArrayList<String> autor = new ArrayList();
    
    public ArrayList<String> gettitulo (){
    return titulo;
    }
    
    public ArrayList<String> getautor (){
    return autor;
    }
    
    public void settitulo (ArrayList<String> titulo){
    this.titulo = titulo;
    
    }
    
    public void setautor (ArrayList<String> titulo){
    this.titulo = autor;
    
    }
   
   

    public List<String> Titulo(String agregado) {
        List<String> titulo = new ArrayList();
        titulo.add(agregado);

        return titulo;
    }

    public List<String> Autor(String agregado) {
        List<String> autor = new ArrayList();
        autor.add(agregado);

        return autor;
    }

    public List<String> EliminarAutor(int numero, ArrayList<String> Autor) {
        List<String> autor = new ArrayList();
        int acumulador = 0;
        while (Autor.size() > acumulador) {
            while (acumulador != numero) {
                autor.add(Autor.get(acumulador));
            }
            if (acumulador == numero && acumulador < Autor.size() - 1) {
                acumulador++;
            }
        }

        return autor;
    }

    public List<String> EliminarTitulo(int numero, List<String> Titulo) {
        List<String> titulo = new ArrayList();
        int acumulador = 0;
        while (Titulo.size() > acumulador) {
            while (acumulador != numero) {
                titulo.add(Titulo.get(acumulador));
            }
            if (acumulador == numero && acumulador < Titulo.size()) {
                acumulador++;
            }
        }

        return titulo;
    }
    
    
public void imprimirautor( List<String> autor ){

  for (int i=0;i<autor.size();i++){
System.out.println(autor.get(i));

}

}



public void imprimirtitulo( List<String> titulo ){

  for (int i=0;i<titulo.size();i++){
System.out.println(titulo.get(i));

}

}// fin de imprimir titulo



}// fin del class

