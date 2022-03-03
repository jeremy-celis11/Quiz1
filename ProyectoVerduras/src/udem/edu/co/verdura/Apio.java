/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.verdura;

import udem.edu.co.verdura.interfaces.Verdura;
import udem.edu.co.verdura.abstarct.Tallo;

/**
 *
 * @author JEREMY
 * 3/3/2022
 */
public class Apio extends Tallo implements Verdura{
    public String color;
    public float precio;
    public String duracion;
    /**
     * 
     * @param color de la verdura
     * @param precio en el mercado de la verdura
     * @param duracion en la que es comestible la verdura
     */

    public Apio(String color, float precio, String duracion) {
        this.color = color;
        this.precio = precio;
        this.duracion = duracion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Apio{" + "color=" + color + ", precio=" + precio + ", duracion=" + duracion + ", carateristica= " + super.carateristica +'}';
    }

    @Override
    public void sembrar() {
        
    }

    @Override
    public void regar() {
        
    }
    
    
    
}
