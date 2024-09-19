import java.util.Scanner;
// 1. Escriba un programa que reciba como entrada un valor entero que represente una
// temperatura en la escala Celcios y después calcule y muestre el valor flotante
// equivalente en la escala Farenheit. Utilice la formula F = 1.8C+32.

public class Main {
    public static void main(String[] args) {
        //crear objeto scanner
        Scanner scanner = new Scanner(System.in);
        //pedir al usuario que ingrese un valor
        System.out.println("Ingrese un valor entero que represente una temperatura en la escala Celcios: ");

        int celcios = scanner.nextInt();
        float farenheit = 1.8f * celcios + 32;
        System.out.println("La temperatura en farenheit : " + farenheit);
        
    }
}