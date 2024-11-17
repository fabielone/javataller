// 5. Escriba un programa que reciba como entrada tres cadenas de caracteres y los muestre
// en orden alfabético.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // solicitar al usuario tres cadenas de caracteres
        System.out.println("Ingrese la primera cadena de caracteres: ");
        // leer la primera cadena de caracteres ingresada por el usuario
        String cadena1 = scanner.nextLine();
        System.out.println("Ingrese la segunda cadena de caracteres: ");
        // leer la segunda cadena de caracteres ingresada por el usuario
        String cadena2 = scanner.nextLine();
        System.out.println("Ingrese la tercera cadena de caracteres: ");
        // leer la tercera cadena de caracteres ingresada por el usuario
        String cadena3 = scanner.nextLine();
        // cerrar el objeto scanner
        scanner.close();
        // determinar cuál es la cadena de caracteres menor y cuál es la cadena de caracteres mayor
        if (cadena1.compareTo(cadena2) < 0 && cadena1.compareTo(cadena3) < 0) {
            System.out.print(cadena1 + ", ");
            if (cadena2.compareTo(cadena3) < 0) {
                System.out.print(cadena2 + ", ");
                System.out.print(cadena3 + ", ");
            } else {
                System.out.print(cadena3 + ", ");
                System.out.print(cadena2 + ", ");
            }
        } else if (cadena2.compareTo(cadena1) < 0 && cadena2.compareTo(cadena3) < 0) {
            System.out.print(cadena2 + ", ");
            if (cadena1.compareTo(cadena3) < 0) {
                System.out.print(cadena1 + ", ");
                System.out.print(cadena3 + ", ");
            } else {
                System.out.print(cadena3 + ", ");
                System.out.print(cadena1 + ", ");
            }
        } else {
            System.out.print(cadena3 + ", ");
            if (cadena1.compareTo(cadena2) < 0) {
                System.out.print(cadena1 + ", ");
                System.out.print(cadena2 + ", ");
            } else {
                System.out.print(cadena2 + ", ");
                System.out.print(cadena1 + ", ");
            }
        }
    }
}