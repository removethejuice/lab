 
package lab3p2_diegochavez_122211369;
 
public class liquido extends cohetes {
   private float litros;

    public liquido() {
        super ();
    }

    public liquido(float litros, float peso, String nombre, String numero, int potencia, int velocidad) {
        super(peso, nombre, numero, potencia, velocidad);
        this.litros = litros;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    

   
   
   
    
}
