/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_alberthgodoy;

/**
 *
 * @author godoy
 */
public class Clientes {

    //Atributos
    private String nombre;
    private int edad;
    private String nIdentidad;
    private double saldoPagar;

    //Constructor
    public Clientes(String nombre, int edad, String nIdentidad, double saldoPagar) {
        this.nombre = nombre;
        if (edad > 0) {
            this.edad = edad;
        }
        this.nIdentidad = nIdentidad;
        if (saldoPagar >= 0.0) {
            this.saldoPagar = saldoPagar;
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

    public String getnIdentidad() {
        return nIdentidad;
    }

    public void setnIdentidad(String nIdentidad) {
        this.nIdentidad = nIdentidad;
    }

    public double getSaldoPagar() {
        return saldoPagar;
    }

    public void setSaldoPagar(double saldoPagar) {
        if (saldoPagar >= 0.0) {
            this.saldoPagar = saldoPagar;
        }

    }

    //Metodo toString
    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", edad=" + edad + ", nIdentidad=" + nIdentidad + ", saldoPagar=" + saldoPagar + '}';
    }
}
