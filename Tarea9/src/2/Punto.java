public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto punto) {
        this.x = punto.x;
        this.y = punto.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }
}