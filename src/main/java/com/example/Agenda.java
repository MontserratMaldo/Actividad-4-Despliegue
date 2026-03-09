package com.example;

import java.util.List;

public class Agenda {
    public List<String> tareas;
    public List<Boolean> completadas;


    public Agenda(List<String> tareas, List<Boolean> completadas) {
        this.tareas = tareas;
        this.completadas = completadas;
    }

    //Añadir tarea
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        completadas.add(false);
    }

    //Marcar tarea como completada
    public void marcarCompletada(int i) {
        if (i >= 0 && i < completadas.size()) {
            completadas.set(i, true);
        }
    }
    
    //Listar tareas
    public void listarTareas() {
        for (int i = 0; i < tareas.size(); i++) {
            String estado = completadas.get(i) ? "Completada" : "Pendiente";
            System.out.println((i + 1) + ". " + tareas.get(i) + " - " + estado);
        }
    }

    //Eliminar tarea
    public void eliminarTarea(int i) {
        if (i >= 0 && i < tareas.size()) {
            tareas.remove(i);
            completadas.remove(i);
        }
    }
    
    //Ejecutar auto-diagnóstico
    public void diagnostico() {
        int totalTareas = tareas.size();
        int tareasCompletadas = (int) completadas.stream().filter(c -> c).count();
        System.out.println("Total de tareas: " + totalTareas);
        System.out.println("Tareas completadas: " + tareasCompletadas);
        System.out.println("Tareas pendientes: " + (totalTareas - tareasCompletadas));
    }

}
