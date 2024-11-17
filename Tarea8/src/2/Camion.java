public class Camion extends VehiculoTerrestre {
    private int capacidadCarga;

    public Camion(String marca, String modelo, int anio, double precio, int numeroLlantas, int capacidadCarga) {
        super(marca, modelo, anio, precio, numeroLlantas);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
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
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor de camión...");
    }
}