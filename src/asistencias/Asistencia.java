/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asistencias;
import Participantes.Participante;
import Personas.Persona;
import java.time.LocalDate;
/**
 *
 * @author UTN
 */
public class Asistencia extends Persona {
    private Participante participante;
    private boolean presente;

    public Participante getParticipante() {
        return participante;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Asistencia(Participante participante, boolean presente, int id, String nombre, LocalDate fecha, String Telefono) {
        super(id, nombre, fecha, Telefono);
        this.participante = participante;
        this.presente = presente;
    }

  
    }
    
    

