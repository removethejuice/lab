/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_diegochavez_122211369;

/**
 *
 * @author 50497
 */
public class lunas {
    
    private int crateres;
    private String nombre;

    public lunas(int crateres, String nombre) {
        this.crateres = crateres;
        this.nombre = nombre;
    }

    public int getCrateres() {
        return crateres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCrateres(int crateres) {
        this.crateres = crateres;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "lunas{" + "crateres=" + crateres + ", nombre=" + nombre + '}';
    }
    
    
    
}
