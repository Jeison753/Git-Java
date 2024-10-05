
package pruebas.empresa_grupoaval;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        empresa_grupoaval gestor = new empresa_grupoaval(10); 
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar Tarea");
            System.out.println("2. Eliminar Tarea");
            System.out.println("3. Listar Tareas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título de la tarea: ");
                    String tarea = scanner.nextLine();
                    gestor.agregarTarea(tarea);
                    break;
                case 2:
                    System.out.print("Ingrese el índice de la tarea a eliminar: ");
                    int indice = scanner.nextInt();
                    gestor.eliminarTarea(indice);
                    break;
                case 3:
                    gestor.listarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}



    

