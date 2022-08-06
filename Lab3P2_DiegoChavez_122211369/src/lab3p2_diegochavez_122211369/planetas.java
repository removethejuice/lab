 
package lab3p2_diegochavez_122211369;
 
import java.util.ArrayList;

public class planetas {
// nombre(único), masa, radio, temperatura
//promedio, velocidad de escape y una lista de lunas.
    private String nombre;
    private float masa;
    private float radio;
    private float temperatura;
    private float velocidad;
    private ArrayList<lunas> lunas = new ArrayList();

    public planetas() {
        
    }

    
    public planetas(String nombre, float masa, float radio, float temperatura) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.velocidad = (float) Math.pow(2*6.67*Math.pow(10,-11)/radio,0.5);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = (float) Math.pow(2*6.67*Math.pow(10,-11)/radio,0.5);
    }

    public void setLunas(ArrayList<lunas> lunas) {
        this.lunas = lunas;
    }

    public String getNombre() {
        return nombre;
    }

    public float getMasa() {
        return masa;
    }

    public float getRadio() {
        return radio;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public ArrayList<lunas> getLunas() {
        return lunas;
    }

    @Override
    public String toString() {
        return "planetas{" + "nombre=" + nombre + ", masa=" + masa + ", radio=" + radio + ", temperatura=" + temperatura + ", velocidad=" + velocidad + ", lunas=" + lunas + '}';
    }
    
    
    
    
}// fin del class
