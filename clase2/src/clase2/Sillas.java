
package clase2;

import java.awt.Color;

public class Sillas {
    private int cod;
    private Color color;
    private String material;

    public Sillas(int cod, Color color, String material) {
        this.cod = cod;
        this.color = color;
        this.material = material;
    }
    
    public Sillas (){
    
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCod() {
        return cod;
    }

    public Color getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Sillas{" + "cod=" + cod + ", color=" + color + ", material=" + material + '}';
    }
    
}
