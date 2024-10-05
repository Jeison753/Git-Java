

package pruebas.empresa_grupoaval;


public class empresa_grupoaval {
    private String[] tareas;
    private int contador;

    public empresa_grupoaval(int capacidad) {
        tareas = new String[capacidad];
        contador = 0;
    }

    public empresa_grupoaval(String[] tareas, int contador) {
        this.tareas = tareas;
        this.contador = contador;
    }
    

    public void agregarTarea(String tarea) {
        if (contador < tareas.length) {
            tareas[contador] = tarea;
            contador++;
            System.out.println("Tarea agregada exitosamente.");
        } else {
            System.out.println("No se pueden agregar más tareas. Capacidad máxima alcanzada.");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < contador) {
            for (int i = indice; i < contador - 1; i++) {
                tareas[i] = tareas[i + 1];
            }
            tareas[contador - 1] = null; // Limpiar el último elemento
            contador--;
            System.out.println("Tarea eliminada exitosamente.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void listarTareas() {
        if (contador == 0) {
            System.out.println("No hay tareas disponibles.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(i + ": " + tareas[i]);
            }
        }
    }
}


