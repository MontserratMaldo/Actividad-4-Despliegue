package com.example;

public class App 
{
    public static void main(String[] args)
    {
        int opcion;
        Agenda agenda = new Agenda(new java.util.ArrayList<>(), new java.util.ArrayList<>());
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {

            // Menu
            System.out.println("\nORGANIZADOR DE TAREAS - [Usuario: " + System.getenv("STUDENT_NAME") + "]");
            System.out.println("1. Agregar una nueva tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar una tarea");
            System.out.println("5. Ejecutar auto-diagnóstico (Tests)");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea:");
                    scanner.nextLine(); // limpiar buffer
                    String descripcion = scanner.nextLine();
                    agenda.agregarTarea(descripcion);
                    break;

                case 2:
                    System.out.println("Listado de tareas:");
                    agenda.listarTareas();
                    break;

                case 3:
                    System.out.println("Ingrese el índice de la tarea a marcar como completada:");
                    int indexCompletada = scanner.nextInt();
                    agenda.marcarCompletada(indexCompletada);
                    break;

                case 4:
                    System.out.println("Ingrese el índice de la tarea a eliminar:");
                    int indexEliminar = scanner.nextInt();
                    agenda.eliminarTarea(indexEliminar);
                    break;

                case 5:
                    System.out.println("Ejecutando auto-diagnóstico...");
                    agenda.diagnostico();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
