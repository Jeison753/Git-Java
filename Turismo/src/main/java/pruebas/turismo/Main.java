
package pruebas.turismo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turismo empresa = new Turismo("Aventura Viajes", "Calle Falsa 123, Ciudad", 5551234, "contacto@aventuraviajes.com");

      
        empresa.agregarTour("Tour a las Montañas Rocosas");
        empresa.agregarTour("Crucero por el Caribe");
        empresa.agregarTour("Safari en Africa");

       
        empresa.mostrarInformacion();
        empresa.mostrarTours();

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del tour que desea seleccionar: ");
        String tourSeleccionado = scanner.nextLine();

        // Llamar al método desde la instancia
        if (empresa.seleccionarTour(tourSeleccionado)) {
            System.out.println("Has seleccionado: " + tourSeleccionado);
        } else {
            System.out.println("El tour '" + tourSeleccionado + "' no esta disponible.");
        }

        scanner.close();
    }
}

    



