/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_alberthgodoy;

import java.util.Date;

/**
 *
 * @author godoy
 */
public class Carros {
    //Atributos
    private String marca;
    private String modelo;
    private String fechaC;
    private Date fechaE;
    private String EstadoAuto;

    //Constructor
    public Carros(String marca, String modelo, String fechaC, Date fechaE, String EstadoAuto) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaC = fechaC;
        this.fechaE = fechaE;
        this.EstadoAuto = EstadoAuto;
    }
    
    //Getter y Setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public Date getFechaE() {
        return fechaE;
    }

    public void setFechaE(Date fechaE) {
        this.fechaE = fechaE;
    }

    public String getEstadoAuto() {
        return EstadoAuto;
    }

    public void setEstadoAuto(String EstadoAuto) {
        this.EstadoAuto = EstadoAuto;
    }
    
    //to String

    @Override
    public String toString() {
        return "Carros{" + "marca=" + marca + ", modelo=" + modelo + ", fechaC=" + fechaC + ", fechaE=" + fechaE + ", EstadoAuto=" + EstadoAuto + '}';
    }
    
    
    
    
}
