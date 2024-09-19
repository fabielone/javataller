// 4. Escriba un programa que reciba como entrada un valor entero n y que muestre los
// números primos hasta el valor n.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // excepcion para evitar que el usuario ingrese un valor no entero
        try {
            // solicitar al usuario un valor entero
            System.out.println("Ingrese un valor entero: ");
            // leer el valor entero ingresado por el usuario
            int n = scanner.nextInt();
            // cerrar el objeto scanner
            scanner.close();
            // asegurarse de que el valor entero ingresado por el usuario sea positivo
            if (n < 1) {
                System.out.println("El valor entero debe ser positivo.");
                return;
            }
            
            // mostrar los números primos hasta el valor n
            System.out.println("Los números primos hasta " + n + " son:");
            for (int i = 2; i <= n; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un valor entero.");
        }
        // solicitar al usuario un valor entero
        System.out.println("Ingrese un valor entero: ");
        // leer el valor entero ingresado por el usuario
        int n = scanner.nextInt();
        // cerrar el objeto scanner
        scanner.close();
        // asegurarse de que el valor entero ingresado por el usuario sea positivo
        if (n < 1) {
            System.out.println("El valor entero debe ser positivo.");
            return;
        }
        
        // mostrar los números primos hasta el valor n
        System.out.println("Los números primos hasta " + n + " son:");
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // metodo para determinar si un numero es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}