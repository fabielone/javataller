
import java.util.Scanner;

// 5. Escribe y prueba un método round(float x) que reciba un valor flotante y regrese el
// valor entero más cercano al valor flotante.
class Round{
    public int round(float x){
        return Math.round(x);   
    }
}

public class Main {
    public static void main(String[] args) {
        Round round = new Round();
        Scanner scanner = new Scanner(System.in);

        //ingrese el valor flotante
        System.out.println("Ingrese el valor flotante: ");
        float x = scanner.nextFloat();

        System.out.println(round.round(x));
    
    }
}
