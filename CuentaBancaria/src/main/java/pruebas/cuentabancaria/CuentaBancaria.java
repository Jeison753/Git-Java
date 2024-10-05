

package pruebas.cuentabancaria;

import java.util.Scanner;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Has depositado: " + cantidad);
        System.out.println("Saldo actual: " + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Has retirado: " + cantidad);
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        
        int opcion;

        do {
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    depositar(deposito);
                    break;
                case 2:
                    System.out.print("Introduce la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    retirar(retiro);
                    break;
                case 3:
                    System.out.println("Saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);
    }
     public void mostrarDatos(){
     System.out.println("titular:" + titular);
     System.out.println("saldo:" + saldo);
    }
}
