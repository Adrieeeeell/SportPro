/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrenadores;
import disciplinas.Disciplina;
import Personas.Persona;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Entrenador extends Persona {
    private String Experiencia;
    protected Disciplina Disciplina;
    public Entrenador(int id, String nombre, LocalDate fecha, String Telefono,String experiencia) {
        super(id, nombre, fecha, Telefono);
        Experiencia=experiencia;
    }

    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
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

    public Disciplina getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(Disciplina Disciplina) {
        this.Disciplina = Disciplina;
    }
    @Override
    public String toString() {
        return "Participante"+"Cedula"+this.getId()+this.getNombre()+"Edad"+this.getFecha()+"telefono de contacto"+this.getTelefono()+"Disciplina"+this.getDisciplina()+"años de experiencia"+this.getExperiencia();
    }
    
}
