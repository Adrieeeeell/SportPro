/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrenamientos;
import Participantes.Participante;
import asistencias.Asistencia;
import disciplinas.Disciplina;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Aaron
 */
public class Entrenamiento {

    private LocalDate fecha;
    private LocalTime horaInicio;
    private int duracionMinutos;
    private Disciplina disciplina;

    private Asistencia[] asistencias;
    private int cantidadAsistencias;

    public Entrenamiento(LocalDate fecha, LocalTime horaInicio, int duracionMinutos, Disciplina disciplina) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracionMinutos = duracionMinutos;
        this.disciplina = disciplina;

        this.asistencias = new Asistencia[50];
        this.cantidadAsistencias = 0;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Asistencia[] getAsistencias() {
        return asistencias;
    }

    public int getCantidadAsistencias() {
        return cantidadAsistencias;
    }

    public boolean registrarAsistencia(Participante participante, boolean presente) {
    if (participante == null) {
        return false;
    }

    if (cantidadAsistencias >= asistencias.length) {
        return false;
    }

    asistencias[cantidadAsistencias] = new Asistencia(participante, presente);
    cantidadAsistencias++;

    return true;
}

    public boolean participanteAsistio(Participante participante) {
        if (participante == null) {
            return false;
        }

        for (int i = 0; i < cantidadAsistencias; i++) {
            if (asistencias[i].getParticipante() == participante && asistencias[i].isPresente()) {
                return true;
            }
        }

        return false;
    }

    public int obtenerCantidadAsistentes() {
        int contador = 0;

        for (int i = 0; i < cantidadAsistencias; i++) {
            if (asistencias[i].isPresente()) {
                contador++;
            }
        }

        return contador;
    }
}