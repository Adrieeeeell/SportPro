/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asistencias;
import Participantes.Participante;
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

    public Asistencia(Participante participante, boolean presente) {
        this.participante = participante;
        this.presente = presente;
    }
    
    
}
