public class Lancha extends VehiculoMarino {
    private int numeroPasajeros;

    public Lancha(String marca, String modelo, int anio, double precio, int numeroMotores, int numeroPasajeros) {
        super(marca, modelo, anio, precio, numeroMotores);
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public void navegar() {
        System.out.println("Navegando en lancha...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Número de motores: " + getNumeroMotores());
        System.out.println("Número de pasajeros: " + numeroPasajeros);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motores marinos...");
    }
}