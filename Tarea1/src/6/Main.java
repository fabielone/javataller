// 6. Escriba un programa que reciba como entrada un valor entero representando un año
// entre 1800 y 2022 y que muestre si es año bisiesto o no. Un año bisiesto es un entero
// mayor que 1584 que es divisible entre 400 o es divisible entre 4, pero no entre 100.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // solicitar al usuario un año entre 1800 y 2022

        while (true) {
            System.out.println("Ingrese un año entre 1800 y 2022: ");
            // leer el año ingresado por el usuario
            int anio = scanner.nextInt();
            if (anio > 1584) {
                if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
                    System.out.println("El año " + anio + " es bisiesto");
                } else {
                    System.out.println("El año " + anio + " no es bisiesto");
                }
                break;
            } else {
                System.out.println("El año debe ser mayor que 1584.");
            }
        }
        System.out.println("Ingrese un año entre 1800 y 2022: ");
        // leer el año ingresado por el usuario
        int anio = scanner.nextInt();
        // cerrar el objeto scanner
        scanner.close();
        // determinar si el año ingresado es bisiesto o no
        if (anio > 1584 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}