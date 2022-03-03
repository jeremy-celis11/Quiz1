/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.verdura;

import udem.edu.co.verdura.abstarct.Raiz;
import udem.edu.co.verdura.interfaces.Verdura;

/**
 *
 * @author JEREMY
 */
public class Rabano extends Raiz implements Verdura{
    
    public String color;
    public float precio;
    public String duracion;

    /**
     * 
     * @param color de la verdura
     * @param precio en el mercado de la verdura
     * @param duracion en la que es comestible la verdura
     */
    public Rabano(String color, float precio, String duracion) {
        super();
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

    public String getCarateristica() {
        return carateristica;
    }

    public void setCarateristica(String carateristica) {
        this.carateristica = carateristica;
    }
    
    @Override
    public void sembrar() {
        
    }

    @Override
    public void regar() {
        
    }

    @Override
    public String toString() {
        return "Rabano{" + "color=" + color + ", precio=" + precio + ", duracion=" + duracion + ", carateristica= " + super.carateristica +'}';
    }
    
    
}
