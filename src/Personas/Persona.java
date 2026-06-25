/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aaron
 */
public abstract class Persona {
    protected int id;
    protected String nombre;
    protected LocalDate fecha;
    protected String Telefono;

    public Persona(int id, String nombre, LocalDate fecha, String Telefono) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.Telefono = Telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    protected int calcularEdad(){
        return Period.between(fecha,LocalDate.now()).getYears();
    }
}
