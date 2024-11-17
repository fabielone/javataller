// • Escribe y prueba una clase que represente un punto en el espacio bidimensional. La clase debe incluir x, y como variables de instancia, así como métodos
// getters, setters, mover y toString.

class Punto{
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void mover(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}

public class Main{
    public static void main(String[] args){
        Punto p = new Punto(3, 4);
        System.out.println(p);
        p.mover(5, 6);
        System.out.println(p);
    }
}
