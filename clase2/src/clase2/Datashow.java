
package clase2;

import java.awt.Color;

public class Datashow {
    private int codigo;
    private Color c;
    private String resolucion;

    public Datashow(int codigo, Color c, String resolucion) {
        this.codigo = codigo;
        this.c = c;
        this.resolucion = resolucion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    
    public Datashow (){
    
    }

    public int getCodigo() {
        return codigo;
    }

    public Color getC() {
        return c;
    }

    public String getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        return "Datashow{" + "codigo=" + codigo + ", c=" + c + ", resolucion=" + resolucion + '}';
    }
    
    
    
    
}
