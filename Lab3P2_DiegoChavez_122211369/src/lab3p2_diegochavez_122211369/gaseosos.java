
package lab3p2_diegochavez_122211369;

public class gaseosos extends planetas {
    private float presion;
    private int anillos;

    public gaseosos() {
         super();
    }

    public gaseosos(float presion, int anillos, String nombre, float masa, float radio, float temperatura) {
        super(nombre, masa, radio, temperatura);
        this.presion = presion;
        this.anillos = anillos;
    }

    public float getPresion() {
        return presion;
    }

    public int getAnillos() {
        return anillos;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    @Override
    public String toString() {
        return "gaseosos{" + "presion=" + presion + ", anillos=" + anillos + '}';
    }
    
    
}// fin del class
