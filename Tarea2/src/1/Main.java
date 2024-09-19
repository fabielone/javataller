// 1. Escriba un programa que reciba como entrada cinco valores flotantes y muestre el
// promedio.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        try {
            // solicitar al usuario cinco valores flotantes
            System.out.println("Ingrese cinco valores flotantes: ");
            
            // usar bucle para leer los valores y sumarlos
            float suma = 0;
            int cantidadValores = 5;
            for (int i = 1; i <= cantidadValores; i++) {
                System.out.print("Ingrese el valor " + i + ": ");
                float valor = scanner.nextFloat();
                suma += valor; // sumar cada valor a la variable suma
            }

            // cerrar el objeto scanner
            scanner.close();
            
            // calcular el promedio
            float promedio = suma / cantidadValores;

            // mostrar el promedio
            System.out.println("El promedio de los cinco valores flotantes ingresados es: " + promedio);
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un valor flotante válido.");
        }
    }
}
