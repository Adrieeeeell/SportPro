/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

import Entrenadores.Entrenador;
import Entrenamientos.Entrenamiento;
import Participantes.Participante;
import asistencias.Asistencia;
import categorias.Categoria;

/**
 *
 * @author HP
 */
public class Disciplina {
 private String nombre;
    private Categoria categoria;

    private Entrenador entrenador;

    private Participante[] participantes;
    private int cantidadParticipantes;

    private Entrenamiento[] entrenamientos;
    private int cantidadEntrenamientos;
    private Asistencia[] asistencias;

    public Disciplina(String nombre, Categoria categoria, int capacidadMaxima) {
        this.nombre = nombre;
        this.categoria = categoria;

        this.participantes = new Participante[30];

        this.entrenamientos = new Entrenamiento[50];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Entrenador getEntrenador() {
        return entrenador;
    }
    
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;

        if (entrenador != null) {
            entrenador.setDisciplina(this);
        }
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public Entrenamiento[] getEntrenamientos() {
        return entrenamientos;
    }

    public int getCantidadEntrenamientos() {
        return cantidadEntrenamientos;
    }

    public boolean tieneEspaciosDisponibles() {
        return cantidadParticipantes < 30;
    }

    public boolean alcanzoCapacidadMaxima() {
        return cantidadParticipantes >= 30;
    }

    public int obtenerCantidadParticipantes() {
    int contador = 0;

    for (int i = 0; i <=30; i++) {
        if (participantes[i] != null) {
            contador++;
        }
    }
    

    return contador;
    }
    public double calcularHorasTotalesEntrenamiento() {
    double horasTotales = 0;

    for (int i = 0; i < entrenamientos.length; i++) {
        if (entrenamientos[i] != null) {
            horasTotales += entrenamientos[i].getDuracionMinutos();
        }
    }

    return horasTotales;
    }
    public double calcularPorcentajeAsistencia(Participante participante) {
    int totalRegistros = 0;
    int presentes = 0;

    for (int i = 0; i < asistencias.length; i++) {
        if (asistencias[i] != null
                && asistencias[i].getParticipante().equals(participante)) {

            totalRegistros++;

            if (asistencias[i].isPresente()) {
                presentes++;
            }
        }
    }

    if (totalRegistros == 0) {
        return 0;
    }

    return (presentes * 100.0) / totalRegistros;
    }
    public boolean hayEspaciosDisponibles() {
    return obtenerCantidadParticipantes() <= 30;
    }

    public boolean agregarParticipante(Participante participante) {
        if (participante == null) {
            return false;
        }

        if (!tieneEspaciosDisponibles()) {
            return false;
        }

        participantes[cantidadParticipantes] = participante;
        cantidadParticipantes++;

        participante.setDiciplina(this);

        return true;
    }

    public boolean agregarEntrenamiento(Entrenamiento entrenamiento) {
        if (entrenamiento == null) {
            return false;
        }

        if (cantidadEntrenamientos >= entrenamientos.length) {
            return false;
        }

        entrenamientos[cantidadEntrenamientos] = entrenamiento;
        cantidadEntrenamientos++;

        entrenamiento.setDisciplina(this);

        return true;
    }

    public void mostrarInformacion() {
        System.out.println("===== Información de la Disciplina =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Capacidad máxima: " + 30);
        System.out.println("Participantes inscritos: " + cantidadParticipantes);

        if (entrenador != null) {
            System.out.println("Entrenador: " + entrenador.getNombre());
        } else {
            System.out.println("Entrenador: No asignado");
        }

        System.out.println("Cantidad de entrenamientos: " + cantidadEntrenamientos);
        System.out.println("Horas totales de entrenamiento: " + calcularHorasTotalesEntrenamiento());
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nombre=" + nombre + ", categoria=" + categoria + ", entrenador=" + entrenador + ", participantes=" + participantes + ", cantidadParticipantes=" + cantidadParticipantes + ", entrenamientos=" + entrenamientos + ", cantidadEntrenamientos=" + cantidadEntrenamientos + ", asistencias=" + asistencias + '}';
    }
    
}
