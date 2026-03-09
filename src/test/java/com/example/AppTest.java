package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void agregarTareaTest() {
        Agenda agenda = new Agenda(new java.util.ArrayList<>(), new java.util.ArrayList<>());
        agenda.agregarTarea("Hacer codigo de Puebas");
        assertTrue(agenda.tareas.contains("Hacer codigo de Puebas"));
    }

    @Test
    public void marcarCompletadaTest() {
        Agenda agenda = new Agenda(new java.util.ArrayList<>(), new java.util.ArrayList<>());
        agenda.agregarTarea("Hacer cambios en la BD");
        agenda.marcarCompletada(0);
        assertTrue(agenda.completadas.get(0));
    }

    @Test
    public void eliminarTareaTest() {
        Agenda agenda = new Agenda(new java.util.ArrayList<>(), new java.util.ArrayList<>());
        agenda.agregarTarea("Ralizar investigación de Metricas de software");
        agenda.eliminarTarea(0);
        assertTrue(!agenda.tareas.contains("Ralizar investigación de Metricas de software"));
    }

    @Test
    public void listarTareasTest() {
        Agenda agenda = new Agenda(new java.util.ArrayList<>(), new java.util.ArrayList<>());
        agenda.agregarTarea("Hacer codigo de Despliegue");
        agenda.agregarTarea("Hacer diagrama de usuario");
        agenda.listarTareas();
    }

}
