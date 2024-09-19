// 2. Escriba un programa que reciba como entrada un valor entero n, calcule la sumatoria
// desde 1 hasta n y muestre el resultado.

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
            
            // calcular la sumatoria desde 1 hasta n
            int sumatoria = 0;
            for (int i = 1; i <= n; i++) {
                sumatoria += i;
            }
            // mostrar el resultado de la sumatoria desde 1 hasta n
            System.out.println("La sumatoria desde 1 hasta " + n + " es: " + sumatoria);
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
        
        // calcular la sumatoria desde 1 hasta n
        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria += i;
        }
        // mostrar el resultado de la sumatoria desde 1 hasta n
        System.out.println("La sumatoria desde 1 hasta " + n + " es: " + sumatoria);
    }
}