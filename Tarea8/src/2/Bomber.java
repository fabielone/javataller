public class Bomber extends VehiculoAereo {
    private int numeroBombas;

    public Bomber(String marca, String modelo, int anio, double precio, int numeroMotores, int numeroBombas) {
        super(marca, modelo, anio, precio, numeroMotores);
        this.numeroBombas = numeroBombas;
    }

    public int getNumeroBombas() {
        return numeroBombas;
    }

    public void setNumeroBombas(int numeroBombas) {
        this.numeroBombas = numeroBombas;
    }

    public void lanzarBombas() {
        System.out.println("Lanzando bombas...");
    }

    @Override
    public void despegar() {
        System.out.println("Despegando...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Número de motores: " + getNumeroMotores());
        System.out.println("Número de bombas: " + getNumeroBombas());
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motores de bomber...");
    }
}