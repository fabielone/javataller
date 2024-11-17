// Un constructor por omisión es un constructor sin argumentos. Un
// constructor típico es un constructor que recibe como argumento
// valores para las variables de instancia. Un constructor copia es un
// constructor que recibe como argumento un objeto del mismo tipo y
// copia los valores de las variables de instancia.

// • Escriba y prueba una clase Punto (con variables de instancia x, y)
// con constructores por omisión, típico y copia. Agregue getters,
// setters y toString.


public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(3, 4);
        Punto punto3 = new Punto(punto2);

        System.out.println(punto1);
        System.out.println(punto2);
        System.out.println(punto3);

        punto1.setX(5);
        punto1.setY(6);

        System.out.println(punto1);
    }
}