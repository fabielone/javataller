public class Trailer extends VehiculoTerrestre {
    private int numeroEjes;

    public Trailer(String marca, String modelo, int anio, double precio, int numeroLlantas, int numeroEjes) {
        super(marca, modelo, anio, precio, numeroLlantas);
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
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
        System.out.println("Número de ejes: " + getNumeroEjes());
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor de trailer...");
    }
}