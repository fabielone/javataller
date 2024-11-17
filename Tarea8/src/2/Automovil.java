public class Automovil extends VehiculoTerrestre {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int anio, double precio, int numeroLlantas, int numeroPuertas) {
        super(marca, modelo, anio, precio, numeroLlantas);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void rodar() {
        System.out.println("Rodando por la carretera...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Número de llantas: " + getNumeroLlantas());
        System.out.println("Número de puertas: " + getNumeroPuertas());
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor de auto...");
    }
}