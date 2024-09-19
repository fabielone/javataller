// 2. Escriba un programa que reciba como entrada una cadena de 12 dígitos que represente
// un número de teléfono. Extraiga los 2 primeros números correspondientes al código de
// país, Los 3 dígitos siguientes correspondientes con el código de área y los 7 últimos
// dígitos correspondientes con el número de teléfono.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // nuevo objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // solicitar al usuario un número de teléfono de 12 dígitos

        

        while (true) {
            System.out.println("Ingrese un número de teléfono de 12 dígitos: ");
            // leer el número de teléfono ingresado por el usuario
            String numeroTel = scanner.nextLine();
            if (numeroTel.length() == 12) {
                // cerrar el objeto scanner
                scanner.close();
                // extraer los 2 primeros números correspondientes al código de país
                String codigoPais = numeroTel.substring(0, 2);
                String lada = numeroTel.substring(2, 5);
                String numero = numeroTel.substring(5, 12);
                System.out.println("Código de país: " + codigoPais);
                System.out.println("Código de área: " + lada);
                System.out.println("Número de teléfono: " + numero);
    
                break;
            } else {
                System.out.println("El número de teléfono debe tener 12 dígitos.");
            }
        }
       
    }
}