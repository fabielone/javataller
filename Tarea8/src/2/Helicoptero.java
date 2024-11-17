public class Helicoptero extends VehiculoAereo {
    private int numeroHelices;

    public Helicoptero(String marca, String modelo, int anio, double precio, int numeroMotores, int numeroHelices) {
        super(marca, modelo, anio, precio, numeroMotores);
        this.numeroHelices = numeroHelices;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    public void despegar() {
        System.out.println("Despegando helicoptero...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Anio: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Numero de motores: " + getNumeroMotores());
        System.out.println("Numero de helices: " + getNumeroHelices());
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motores de helicoptero...");
    }
}