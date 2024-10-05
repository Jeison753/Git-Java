package pruebas.hipermercado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hipermercado hipermercado = new Hipermercado("Hipermercado La Compra", "Avenida Principal 456, Ciudad", "555-6789", "contacto@lacomprashop.com");

        hipermercado.agregarProducto("Leche");
        hipermercado.agregarProducto("Pan");
        hipermercado.agregarProducto("Arroz");
        hipermercado.agregarProducto("Frutas frescas");

        hipermercado.mostrarInformacion();
        hipermercado.mostrarProductos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto que desea seleccionar: ");
        String productoSeleccionado = scanner.nextLine();

        if (hipermercado.seleccionarProducto(productoSeleccionado)) {
            System.out.println("Has seleccionado: " + productoSeleccionado);
        } else {
            System.out.println("El producto '" + productoSeleccionado + "' no está disponible.");
        }

        scanner.close();
    }
}



