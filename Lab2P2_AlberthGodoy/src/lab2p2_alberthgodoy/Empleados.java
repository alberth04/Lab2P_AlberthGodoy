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
public class Empleados {

    //Atributos 
    private String nombre;
    private int edad;
    private String estadoTrabajo;
    private double sueldo;

    //Constructor
    public Empleados(String nombre, int edad, String estadoTrabajo, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoTrabajo = estadoTrabajo;
        if (sueldo >= 0.0) {
            this.sueldo = sueldo;
        }
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }

    }

    public String getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(String estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= 0.0) {
            this.sueldo = sueldo;
        }

    }


    //to String
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", edad=" + edad + ", estadoTrabajo=" + estadoTrabajo + ", sueldo=" + sueldo +'}';
    }

}
