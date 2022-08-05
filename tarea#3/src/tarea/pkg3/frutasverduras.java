
package tarea.pkg3;

public class frutasverduras {
    //cant, precio, unidad
    private String nombre;
    private float cant;
    private float precio;
    private int unidad2;

    public frutasverduras (){
    
    }
    
    
    public frutasverduras(String nombre,float cant, float precio, int unidad2) {
        this.nombre= nombre;
        this.cant = cant;
        this.precio = precio;
        this.unidad2 = unidad2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCant() {
        return cant;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidad2() {
        return unidad2;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setUnidad2(int unidad2) {
        this.unidad2 = unidad2;
    }
    
    
    public String toString(){
     return "Nombre:"+nombre+" Cantidad:"+cant+" Precio:"+precio +" Unidad:"+unidad2;
    }
    
    
}
