// • Escribe y prueba una clase que represente un monedero en dólares. En el monedero se pueden almacenar monedas de 1, 5, 10 y 25 centavos. La clase debe
// incluir:
// • Variables de instancia para cada denominación de moneda (1, 5, 10 y 25 centavos).
// • Un método depositar(int uno, int cinco, int diez, int veinticinco) que permita agregar al monedero más monedas de cada denominación de acuerdo a
// los parámetros.
// • Un método retirar(int uno, int cinco, int diez, int veinticinco) que permita quitar del monedero las monedas indicadas por los parámetros.
// • Un método total() que regrese el valor total del monedero en dólares.
// • Métodos getters, setters y toString

class Monedero{
    private int uno;
    private int cinco;
    private int diez;
    private int veinticinco;

    public Monedero(int uno, int cinco, int diez, int veinticinco){
        this.uno = uno;
        this.cinco = cinco;
        this.diez = diez;
        this.veinticinco = veinticinco;
    }

    public int getUno(){
        return uno;
    }

    public int getCinco(){
        return cinco;
    }

    public int getDiez(){
        return diez;
    }

    public int getVeinticinco(){
        return veinticinco;
    }

    public void setUno(int uno){
        this.uno = uno;
    }

    public void setCinco(int cinco){
        this.cinco = cinco;
    }

    public void setDiez(int diez){
        this.diez = diez;
    }

    public void setVeinticinco(int veinticinco){
        this.veinticinco = veinticinco;
    }

    public void depositar(int uno, int cinco, int diez, int veinticinco){
        this.uno += uno;
        this.cinco += cinco;
        this.diez += diez;
        this.veinticinco += veinticinco;
    }

    public void retirar(int uno, int cinco, int diez, int veinticinco){
        this.uno -= uno;
        this.cinco -= cinco;
        this.diez -= diez;
        this.veinticinco -= veinticinco;
    }

    public double total(){
        return (uno + cinco * 5 + diez * 10 + veinticinco * 25) / 100.0;
    }

    public String toString(){
        return "Monedero: $" + total();
    }
}

public class Main{
    public static void main(String[] args){
        Monedero m = new Monedero(1, 2, 3, 4);
        System.out.println(m);
        m.depositar(1, 2, 3, 4);
        System.out.println(m);
        m.retirar(1, 2, 3, 4);
        System.out.println(m);
    }
}