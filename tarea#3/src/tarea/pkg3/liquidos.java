/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

public class liquidos {

    private String nombre;
    private int cant2;
    private float precio;
    private int unidad;
    private int tamanio;
    private String lugar;
    private String marca;
    private String codigo;

    // constructor
    public liquidos() {

    }

    public liquidos(String nombre, int cant2, float precio, int unidad, int tamanio , String lugar, String marca, String codigo) {

        this.nombre = nombre;
        this.cant2 = cant2;
        this.precio = precio;
        this.unidad = unidad;
        this.lugar = lugar;
        this.marca = marca;
        this.codigo = codigo;

    }

    public void setnombre(String nombre) {
        this.nombre = nombre;

    }

    public String getnombre() {
        return nombre;
    }

    public void setcant2(int cant2) {
        this.cant2 = cant2;

    }

    public int getcant2() {
        return cant2;

    }

    public void setprecio(float precio) {
        this.precio = precio;

    }

    public float getprecio() {
        return precio;

    }

    public void setunidad(int unidad) {
        this.unidad = unidad;

    }

    public int getunidad() {
        return unidad;

    }
    
    public void settamanio (int tamanio){
    this.tamanio = tamanio;
    }
    
    public int gettamanio(){
    return tamanio;
    }

    public void setlugar(String lugar) {
        this.lugar = lugar;

    }

    public String getlugar() {
        return lugar;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return marca;
    }

    public void setcodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getcodigo() {
        return codigo;
    }
 public String toString(){
     return "Nombre:"+nombre+" Cantidad :"+cant2+" Precio:"+ precio +" Unidad:"+unidad + "Lugar"+lugar +"Tamanio"+tamanio + "Marca: "+ marca + "Codigo"+ codigo ;
    }
 
 
}
