// 3. Escriba un programa que genere dos números enteros aleatorios, muestre cual es el
// menor y cual el mayor.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Random
        Random random = new Random();
        // generar dos números enteros aleatorios
        int num1 = random.nextInt();
        int num2 = random.nextInt();
        // mostrar los números generados
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        // determinar cuál es el menor y cuál es el mayor
        if (num1 < num2) {
            System.out.println("El número " + num1 + " es menor que el número " + num2);
        } else if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}