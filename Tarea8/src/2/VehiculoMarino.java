public abstract class VehiculoMarino extends Vehiculo {
    private int numeroMotores;

    public VehiculoMarino(String marca, String modelo, int anio, double precio, int numeroMotores) {
        super(marca, modelo, anio, precio);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public abstract void navegar();

    @Override
    public void encender() {
        System.out.println("Encendiendo motores marinos...");
    }
}