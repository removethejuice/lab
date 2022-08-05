
package clase2;

import java.awt.Color;
import java.util.Date;


public class Pizarra {
    private double largo;
    private double ancho;
    private Color c;
    private Date fecha;

    public Pizarra(double largo, double ancho, Color c, Date fecha) {
        this.largo = largo;
        this.ancho = ancho;
        this.c = c;
        this.fecha = fecha;
    }
    
    public Pizarra (){
    
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public Color getC() {
        return c;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Pizarra{" + "largo=" + largo + ", ancho=" + ancho + ", c=" + c + ", fecha=" + fecha + '}';
    }
    
    
}
