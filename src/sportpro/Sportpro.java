/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sportpro;
import Participantes.Participante;
import Entrenadores.Entrenador;
import Entrenamientos.Entrenamiento;
import disciplinas.Disciplina;
import categorias.Categoria;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author Student
 */
public class Sportpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("       SISTEMA SPORTPRO - INICIO        ");
        System.out.println("========================================\n");
 
        Categoria categoriaJuvenil = new Categoria();
        Categoria categoriaAdulta  = new Categoria();
 
        Entrenador entrenador1 = new Entrenador(1, "Carlos Méndez", LocalDate.of(1985, 3, 15), "8888-1111", "10 años en natación competitiva");
        Entrenador entrenador2 = new Entrenador(2, "Laura Rodríguez", LocalDate.of(1990, 7, 22), "8888-2222", "5 años en atletismo juvenil");
 
        Disciplina natacion  = new Disciplina("Natación",  categoriaJuvenil, 30);
        Disciplina atletismo = new Disciplina("Atletismo", categoriaAdulta,  30);
 
        natacion.setEntrenador(entrenador1);
        atletismo.setEntrenador(entrenador2);
 
        Participante p1 = new Participante(101, "Ana García",  LocalDate.of(2005, 1, 10),  "7777-0001");
        Participante p2 = new Participante(102, "Luis Pérez",  LocalDate.of(2004, 6, 20),  "7777-0002");
        Participante p3 = new Participante(103, "María López", LocalDate.of(2003, 11, 5),  "7777-0003");
        Participante p4 = new Participante(104, "Juan Mora",   LocalDate.of(2002, 4, 18),  "7777-0004");
 
        natacion.agregarParticipante(p1);
        natacion.agregarParticipante(p2);
        natacion.agregarParticipante(p3);
        atletismo.agregarParticipante(p4);
        atletismo.agregarParticipante(p2);
 
        Entrenamiento sesion1 = new Entrenamiento(LocalDate.of(2025, 6, 10), LocalTime.of(8,  0),  90,  natacion);
        Entrenamiento sesion2 = new Entrenamiento(LocalDate.of(2025, 6, 12), LocalTime.of(9, 30),  60,  natacion);
        Entrenamiento sesion3 = new Entrenamiento(LocalDate.of(2025, 6, 11), LocalTime.of(7,  0), 120, atletismo);
 
        natacion.agregarEntrenamiento(sesion1);
        natacion.agregarEntrenamiento(sesion2);
        atletismo.agregarEntrenamiento(sesion3);
 
        sesion1.registrarAsistencia(p1, true);
        sesion1.registrarAsistencia(p2, true);
        sesion1.registrarAsistencia(p3, false);
 
        sesion2.registrarAsistencia(p1, true);
        sesion2.registrarAsistencia(p2, false);
        sesion2.registrarAsistencia(p3, true);
 
        sesion3.registrarAsistencia(p4, true);
        sesion3.registrarAsistencia(p2, true);
 
        System.out.println("========================================");
        System.out.println("           REPORTES DEL SISTEMA         ");
        System.out.println("========================================\n");
 
        natacion.mostrarInformacion();
        System.out.println();
        atletismo.mostrarInformacion();
 
        System.out.println("\n--- Verificación de asistencia ---");
        System.out.println("¿Ana asistió a sesión 1?   " + sesion1.participanteAsistio(p1));
        System.out.println("¿María asistió a sesión 1? " + sesion1.participanteAsistio(p3));
 
        System.out.println("\n--- Asistentes por sesión ---");
        System.out.println("Sesión 1 (Natación):  " + sesion1.obtenerCantidadAsistentes() + " presentes");
        System.out.println("Sesión 2 (Natación):  " + sesion2.obtenerCantidadAsistentes() + " presentes");
        System.out.println("Sesión 3 (Atletismo): " + sesion3.obtenerCantidadAsistentes() + " presentes");
 
        System.out.println("\n--- Participantes registrados ---");
        Participante[] todos = {p1, p2, p3, p4};
        for (Participante p : todos) {
            System.out.printf("ID: %d | Nombre: %-15s | Teléfono: %s%n", p.getId(), p.getNombre(), p.getTelefono());
        }
 
        System.out.println("\n--- Disponibilidad de cupos ---");
        System.out.println("Natación tiene espacios:  " + natacion.tieneEspaciosDisponibles());
        System.out.println("Atletismo tiene espacios: " + atletismo.tieneEspaciosDisponibles());
 
        System.out.println("\n========================================");
        System.out.println("         SISTEMA SPORTPRO - FIN         ");
        System.out.println("========================================");
    }
}