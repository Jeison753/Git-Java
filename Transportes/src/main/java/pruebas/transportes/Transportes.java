package pruebas.transportes;
import java.util.Scanner;
public class Transportes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la empresa de transportes");
        System.out.println("Seleccione el tipo de transporte:");
        System.out.println("1. Aereo");
        System.out.println("2. Terrestre");
        System.out.println("3. Acuatico");

        int opcion = scanner.nextInt();
        Transporte transporte;

        switch(opcion) {
            case 1:
                transporte = new Transporte_Aereo();
                break;
            case 2:
                transporte = new Transporte_Terrestre();
                break;
            case 3:
                transporte = new Transporte_Acuatico();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

       
        transporte.mostrarInfo();

       
        System.out.println("Ingrese la distancia del viaje en km:");
        double distancia = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de pasajeros:");
        int pasajeros = scanner.nextInt();

    
        double costo = transporte.calcularCosto(distancia, pasajeros);
        double tiempo = transporte.calcularTiempo(distancia);

        System.out.println("Costo estimado del viaje: $" + costo);
        System.out.println("Tiempo estimado del viaje: " + tiempo + " horas.");
    }
}