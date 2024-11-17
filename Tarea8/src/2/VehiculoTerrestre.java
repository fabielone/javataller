public abstract class VehiculoTerrestre extends Vehiculo {
    private int numeroLlantas;

    public VehiculoTerrestre(String marca, String modelo, int anio, double precio, int numeroLlantas) {
        super(marca, modelo, anio, precio);
        this.numeroLlantas = numeroLlantas;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public abstract void rodar();

    @Override
    public void encender() {
        System.out.println("Encendiendo motor terrestre...");
    }
}