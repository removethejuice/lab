/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegochavez_122211369;

import java.util.ArrayList;
import java.util.Random;

 
public class cohetes {
//peso soportable, nombre,número de serie (único), potencia [1-9], velocidad (es un número aleatorio que va de
//5,000*potencia-20,000*potencia) la cual se calculará hasta el momento del lanzamiento. También
//tiene una lista de personas las cuales son las que operaran los cohetes. De las personas solo
//necesitamos saber el nombre, edad y peso
     
    
    private float peso;
    private String nombre;
    private String numero;
    private int potencia;
    private int velocidad;
    private ArrayList<personas> personas = new ArrayList();

    public cohetes(float peso, String nombre,String numero, int potencia, int velocidad) {
        this.peso = peso;
        this.numero = numero;
        this.potencia = potencia;
        this.nombre = nombre;
        this.velocidad =  potencia;
    }

    public cohetes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     

    public float getPeso() {
        return peso;
    }

    public String getNumero() {
        return numero;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public ArrayList<personas> getPersonas() {
        return personas;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad =  potencia;
    }

    public void setPersonas(ArrayList<personas> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "cohetes{" +   ", peso=" + peso + ", numero=" + numero + ", potencia=" + potencia + ", velocidad=" + velocidad + ", personas=" + personas + '}';
    }
    
    
    
    
}// fin del class
