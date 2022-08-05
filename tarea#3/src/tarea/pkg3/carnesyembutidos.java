package tarea.pkg3;

public class carnesyembutidos {

    private float cant;
    private float precio;
    private int unidad;
    private String lugar;

    public carnesyembutidos() {

    }

    public carnesyembutidos(float cant, float precio, int unidad, String lugar) {
        this.cant = cant;
        this.precio = precio;
        this.unidad = unidad;
        this.lugar = lugar;

    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public float getCant() {
        return cant;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

     public String toString(){
     return  " Cantidad :"+cant+" Precio:"+ precio +" Unidad:"+unidad + "Lugar"+lugar   ;
    }
    
}
