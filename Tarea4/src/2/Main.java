
import java.util.Scanner;

// Escribe y prueba un método factorial(int n) que reciba un valor entero y regrese el
// factorial del valor.

class Factorial{
    public int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        
        //ingrese el valor entero
        System.out.println("Ingrese un valor entero: ");
        int n = scanner.nextInt();

        System.out.println(factorial.factorial(n));
    }
}