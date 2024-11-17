// 3. Escriba un programa que reciba como entrada un valor entero n y que muestre los
// primeros n números de Fibonacci.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);

      
            // solicitar al usuario un valor entero
            System.out.println("Ingrese un valor entero: ");
            // leer el valor entero ingresado por el usuario
            int n = scanner.nextInt();
            // cerrar el objeto scanner
            scanner.close();
            
            if (n < 1) {
                System.out.println("El valor entero debe ser positivo.");
                return;
            }
            
            // mostrar los primeros n números de Fibonacci
            System.out.println("Los primeros " + n + " números de Fibonacci son:");
            int a = 0;
            int b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
        } 
       
    
}