package tarea.pkg3;

public class granosbasicos {

    // se conoce el nombre, cantidad de quintales, precio, unidad de medida (libra, medida, kilo) y lugar de procedencia.
//  ||
    private String nombre;
    private float cantquint;
    private float precio;
    private int unidad;
    private String lugar;

    // constructor
    public granosbasicos(String nombre, float cantquint, float precio, int unidad, String lugar) {
        this.nombre = nombre;
        this.cantquint = cantquint;
        this.precio = precio;
        this.unidad = unidad;
        this.lugar = lugar;

    }

    // mutadores
    public void setnombre(String nombre) {
        this.nombre = nombre;

    }

    public String getnombre() {
        return nombre;
    }

    public void setcantquint(float cantquint) {
        this.cantquint = cantquint;

    }

    public float getcantquint() {
        return cantquint;

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

    public void setlugar(String lugar) {
        this.lugar = lugar;

    }

    public String getlugar() {
        return lugar;
    }
 public String toString(){
     return "Nombre:"+nombre+" Cantidad de quintales:"+cantquint+" Precio:"+precio +" Unidad:"+unidad + "Lugar"+lugar;
    }
 

}// fin del class
