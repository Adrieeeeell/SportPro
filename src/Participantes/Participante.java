/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participantes;
import disciplinas.Disciplina;
import Personas.Persona;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Participante extends Persona {
private Disciplina Diciplina;
    @Override
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String getTelefono() {
        return Telefono;
    }

    public Disciplina getDiciplina() {
        return Diciplina;
    }

    public void setDiciplina(Disciplina Diciplina) {
        this.Diciplina = Diciplina;
    }
    
    
    public Participante(int id, String nombre, LocalDate fecha, String Telefono) {
        super(id, nombre, fecha, Telefono);
    }
    
}
