// 4. Escribe y prueba un método mcd(int a, int b) que reciba dos valores enteros y regrese
// el máximo común divisor de los dos valores.

import java.util.Scanner;
class Mcd{
    public int mcd(int a, int b){
        if(b == 0){
            return a;
        }
        return mcd(b, a % b);
    }
}

public class Main {
    public static void main(String[] args) {
        Mcd mcd = new Mcd();
        Scanner scanner = new Scanner(System.in);
        
        //ingrese el valor entero
        System.out.println("Ingrese el valor de a: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el valor de b: ");
        int b = scanner.nextInt();

        System.out.println(mcd.mcd(a, b));
    }
}