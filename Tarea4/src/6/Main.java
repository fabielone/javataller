// Escribe y prueba un método isPrime(int n) que reciba un valor entero y regrese un valor
// booleano (falso o verdadero) que indique si el valor es un número primo o no.

import java.util.Scanner;

class IsPrime{
    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        Scanner scanner = new Scanner(System.in);
        
        //ingrese el valor entero
        System.out.println("Ingrese un valor entero: ");
        int n = scanner.nextInt();

        System.out.println(isPrime.isPrime(n));
    }
}