
// 1. Escribe y prueba los métodos de una clase que contenga:
// a. Un método llamado max(int a, int b) que reciba dos valores enteros y regrese el
// mayor de los dos valores.
// b. Un método llamado max(int a, int b, int c) que reciba tres valores enteros y
// regrese el mayor de los tres valores.
// c. Un método llamado max(int a, int b, int c, int d) que reciba cuatro valores
// enteros y regrese el mayor de los cuatro valores.

class Max{

    public int max(int a, int b){
        return a > b ? a : b;
    }

    public int max(int a, int b, int c){
        return max(max(a, b), c);
    }

    public int max(int a, int b, int c, int d){
        return max(max(a, b, c), d);
    }

}

public class Main {
    public static void main(String[] args) {
        Max max = new Max();
        System.out.println(max.max(16, 8));
        System.out.println(max.max(196, 234, 47));
        System.out.println(max.max(236, 36, 4, 346));
    }
}