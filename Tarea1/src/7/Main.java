// 7. Escriba un programa que reciba como entrada el nombre de un mes y después lo
// procese de la siguiente manera:
// a. Extraer las tres primeras letras y convertirlas a mayúsculas.
// b. Mostrar esa abreviatura.
// c. Mostrar el número de mes correspondiente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // solicitar al usuario el nombre de un mes
        System.out.println("Ingrese el nombre de un mes: ");
        // leer el nombre del mes ingresado por el usuario
        String mes = scanner.nextLine();
       
        scanner.close();
        // asegurarse de que el nombre del mes ingresado por el usuario no esté vacío
        if (mes.isEmpty()) {
            System.out.println("El nombre del mes no puede estar vacío.");
            return;
        }
       
        //nombre del mes solo puede tener letras
        if (!mes.matches("[a-zA-Z]+")) {
            System.out.println("El nombre del mes debe contener solo letras.");
            return;
        }
        
        // extraer las tres primeras letras del nombre del mes y convertirlas a mayúsculas


        String abreviatura = mes.substring(0, 3).toUpperCase();
        // determinar el número de mes correspondiente
        int numeroMes = 0;
        switch (abreviatura) {
            case "ENE":
                numeroMes = 1;
                break;
            case "FEB":
                numeroMes = 2;
                break;
            case "MAR":
                numeroMes = 3;
                break;
            case "ABR":
                numeroMes = 4;
                break;
            case "MAY":
                numeroMes = 5;
                break;
            case "JUN":
                numeroMes = 6;
                break;
            case "JUL":
                numeroMes = 7;
                break;
            case "AGO":
                numeroMes = 8;
                break;
            case "SEP":
                numeroMes = 9;
                break;
            case "OCT":
                numeroMes = 10;
                break;
            case "NOV":
                numeroMes = 11;
                break;
            case "DIC":
                numeroMes = 12;
                break;
            default:
                System.out.println("El mes ingresado no es válido.");
                return;
        }
        // mostrar la abreviatura y el número de mes correspondiente
        System.out.println("Abreviatura: " + abreviatura);
        System.out.println("Número de mes: " + numeroMes);
    }
}