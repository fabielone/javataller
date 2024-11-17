

public class Circulo {

    private Punto radio;
    private Punto centro;

    public Circulo() {
        this.radio = new Punto();
        this.centro = new Punto();
    }       

    public Circulo(Punto radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public Circulo(Circulo circulo) {
        this.radio = new Punto(circulo.radio);
        this.centro = new Punto(circulo.centro);
    }

    public Punto getRadio() {
        return radio;
    }

    public void setRadio(Punto radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", centro=" + centro + "]";
    }

    
    
}