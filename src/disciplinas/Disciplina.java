/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

import Entrenadores.Entrenador;
import Participantes.Participante;
import categorias.Categoria;

/**
 *
 * @author HP
 */
public class Disciplina {
    private String nombre;
    private Categoria categoria;
    private int capacidadMaxima;
    private Entrenador entrenador;

    private Participante[] participantes;
    private int cantidadParticipantes;

    public Disciplina(String nombre, Categoria categoria,
                      int capacidadMaxima, Entrenador entrenador) {

        this.nombre = nombre;
        this.categoria = categoria;
        this.capacidadMaxima = capacidadMaxima;
        this.entrenador = entrenador;

        this.participantes = new Participante[capacidadMaxima];
        this.cantidadParticipantes = 0;
        
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public int getEspaciosDisponibles() {
        return capacidadMaxima - cantidadParticipantes;
    }

    public void agregarParticipante(Participante participante) {
        if (cantidadParticipantes < capacidadMaxima) {
            participantes[cantidadParticipantes] = participante;
            cantidadParticipantes++;
        } else {
            System.out.println("No hay espacios disponibles.");
        }
    }
}
