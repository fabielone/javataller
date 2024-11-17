// Escribe y prueba un método pow(int x, int y) que reciba dos valores enteros y regrese
// el primer valor elevado a la potencia del segundo valor.

import java.util.Scanner;
class Pow{
    public int pow(int x, int y){
        if(y == 0){
            return 1;
        }
        return x * pow(x, y - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Pow pow = new Pow();
        Scanner scanner = new Scanner(System.in);
        
        //ingrese el valor entero
        System.out.println("Ingrese el valor de x: ");
        int x = scanner.nextInt();
        System.out.println("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        System.out.println(pow.pow(x, y));
    }
}