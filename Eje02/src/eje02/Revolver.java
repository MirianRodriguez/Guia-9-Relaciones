/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje02;

/**
 *
 * @author mirod
 */
public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        this.posicionActual = (int) (Math.random() * 6 + 1);
        System.out.println("posicion actual " + this.posicionActual);
        this.posicionAgua = (int) (Math.random() * 6 + 1);
        System.out.println("posicion agua " + this.posicionAgua);
    }
    
    public boolean mojar(){
        return this.posicionActual == this.posicionAgua;
    }
    
    public void siguienteChorro(){
        if (this.posicionActual == 6) {
            this.posicionActual = 1;
        } else {
            this.posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
}
