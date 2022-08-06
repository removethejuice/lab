 
package lab3p2_diegochavez_122211369;

import java.util.Random;

 
public class solido extends cohetes {
    
    private float kilos;
    private String material;

    public solido(float kilos, String material, float peso,String nombre, String numero, int potencia, int velocidad) {
        super(peso,nombre, numero, potencia, velocidad);
        this.kilos = kilos;
        this.material = material;
    }

    public solido(float kilos, String material) {
        super();
    }

    public float getKilos() {
        return kilos;
    }

    public String getMaterial() {
        return material;
    }

    public void setKilos(float kilos) {
        this.kilos = kilos;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "solido{" + "kilos=" + kilos + ", material=" + material + '}';
    }

    
    
    
    
}// fin del class
