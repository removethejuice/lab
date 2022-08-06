
package lab3p2_diegochavez_122211369;

import java.util.Random;

public class fases extends cohetes {
   
    // Tiene cantidad de fases, cantidad de motores y altura
    private int cantfases;
    private int motores;
    private float altura;

    public fases() {
        super();
    }

    public fases(int fases, int motores, float altura, float peso,String nombre, String numero, int potencia, int velocidad) {
        super(peso,nombre, numero, potencia, velocidad);
        this.cantfases = fases;
        this.motores = motores;
        this.altura = altura;
    }

    public int getFases() {
        return cantfases;
    }

    public int getMotores() {
        return motores;
    }

    public float getAltura() {
        return altura;
    }

    public void setFases(int fases) {
        this.cantfases = fases;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "fases{" + "fases=" + cantfases + ", motores=" + motores + ", altura=" + altura + '}';
    }

 

    

     
    
    
}
