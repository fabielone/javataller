public abstract class VehiculoAereo extends Vehiculo {
    private int numeroMotores;

    public VehiculoAereo(String marca, String modelo, int anio, double precio, int numeroMotores) {
        super(marca, modelo, anio, precio);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public abstract void despegar();

    @Override
    public void encender() {
        System.out.println("Encendiendo jet engine...");
    }
}