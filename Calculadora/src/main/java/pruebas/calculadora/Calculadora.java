

package pruebas.calculadora;


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Bienvenido a la calculadora");
            
            System.out.println("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("Ingresa la operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);
            
            double resultado;
            
            switch (operacion) {
                case '+' -> {
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                }
                case '-' -> {
                    resultado = num1 - num2;
                    System.out.println("El resultado es: " + resultado);
                }
                case '*' -> {
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                }
                case '/' -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado es: " + resultado);
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                }
                default -> System.out.println("Operación no válida.");
            }
        }
    }
}


