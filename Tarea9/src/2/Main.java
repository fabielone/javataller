// Un constructor por omisión es un constructor sin argumentos. Un
// constructor típico es un constructor que recibe como argumento
// valores para las variables de instancia. Un constructor copia es un
// constructor que recibe como argumento un objeto del mismo tipo y
// copia los valores de las variables de instancia.


// • Escriba y prueba una clase Circulo (con variables de instancia radio
// y centro, de tipo Punto) con constructores por omisión, típico y
// copia. Agregue getters, setters y toString.

public class Main {
    public static void main(String[] args) {
        Punto radio = new Punto(3, 4);
        Punto centro = new Punto(5, 6);
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(radio, centro);
        Circulo circulo3 = new Circulo(circulo2);

        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(circulo3);

        radio.setX(7);
        radio.setY(8);
        centro.setX(9);
        centro.setY(10);

        System.out.println(circulo2);
    }
}