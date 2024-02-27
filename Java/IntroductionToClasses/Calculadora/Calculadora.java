
package calculadora;

import java.util.Scanner;

public class Calculadora {

   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declarar variable para continuar con otra operación
        char continuar;

        do {
            // Solicitar al usuario que ingrese el primer número
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            // Solicitar al usuario que ingrese el segundo número
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            // Crear objeto de la calculadora con los números ingresados
            Operaciones calculadora = new Operaciones(num1, num2);

            // Mostrar las operaciones disponibles
            System.out.println("\nOperaciones disponibles:");
            System.out.println("1. Suma (+)");
            System.out.println("2. Resta (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            System.out.println("5. Exponente (^)");
            System.out.println("6. Raíz cuadrada (√)");

            // Solicitar al usuario que elija una operación
            System.out.print("\nElija una operación (1-6): ");
            int opcion = scanner.nextInt();

            double resultado = 0;

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    resultado = calculadora.sumar();
                    break;
                case 2:
                    resultado = calculadora.restar();
                    break;
                case 3:
                    resultado = calculadora.multiplicar();
                    break;
                case 4:
                    try {
                        resultado = calculadora.dividir();
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.exit(1); 
                    }
                    break;
                case 5:
                    resultado = calculadora.exponente();
                    break;
                case 6:
                    resultado = calculadora.raizCuadrada();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.exit(1); 
            }

            // Mostrar el resultado
            System.out.println("\nEl resultado es: " + resultado);

            // Preguntar al usuario si desea continuar
            System.out.print("\n¿Desea hacer otra operación? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}