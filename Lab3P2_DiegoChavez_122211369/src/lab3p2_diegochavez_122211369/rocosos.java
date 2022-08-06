
package lab3p2_diegochavez_122211369;

public class rocosos extends planetas{

    private boolean indicador;
    private float densidad;

    public rocosos() {
         super();
    }

    public rocosos(boolean indicador, float densidad, String nombre, float masa, float radio, float temperatura) {
        super(nombre, masa, radio, temperatura);
        this.indicador = indicador;
        this.densidad = densidad;
    }

    public boolean isIndicador() {
        return indicador;
    }

    public float getDensidad() {
        return densidad;
    }

    public void setIndicador(boolean indicador) {
        this.indicador = indicador;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }

    @Override
    public String toString() {
        return "rocosos{" + "indicador=" + indicador + ", densidad=" + densidad + '}';
    }
    
    
    
    
}// fin del class
