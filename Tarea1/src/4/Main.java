// 4. Escriba un programa que genere tres números enteros aleatorios y muéstrelos en orden
// ascendente.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Random
        Random random = new Random();
        // generar tres números enteros aleatorios
        int num1 = random.nextInt();
        int num2 = random.nextInt();
        int num3 = random.nextInt();
        // determinar cuál es el menor y cuál es el mayor
        if (num1 < num2 && num1 < num3) {
            System.out.print(""+num1 + ", ");
            if (num2 < num3) {
                System.out.print(num2 +", ");
                System.out.print(num3 + ", ");
            } else {
                System.out.print(num3 + ", ");
                System.out.print( num2 + ", ");
            }
        } else if (num2 < num1 && num2 < num3) {
            System.out.print(num2 + ", ");
            if (num1 < num3) {
                System.out.print( num1 + ", ");
                System.out.print( num3 + ", ");
            } else {
                System.out.print(num3 + ", ");
                System.out.print(num1 + ", ");
            }
        } else {
            System.out.print(num3 + ", ");
            if (num1 < num2) {
                System.out.print(num1 + ", ");
                System.out.print(num2 + ", ");
            } else {
                System.out.print(num2 + ", ");
                System.out.print(num1 + ", ");
            }
        }
    }
}