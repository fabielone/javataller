public class Yate extends VehiculoMarino {
    private int numeroCamarotes;

    public Yate(String marca, String modelo, int anio, double precio, int numeroMotores, int numeroCamarotes) {
        super(marca, modelo, anio, precio, numeroMotores);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public void navegar() {
        System.out.println("Navegando en yate...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Número de motores: " + getNumeroMotores());
        System.out.println("Número de camarotes: " + getNumeroCamarotes());
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motores marinos...");
    }
}