public class Jet extends VehiculoAereo {
    private int numeroTurbinas;

    public Jet(String marca, String modelo, int anio, double precio, int numeroMotores, int numeroTurbinas) {
        super(marca, modelo, anio, precio, numeroMotores);
        this.numeroTurbinas = numeroTurbinas;
    }

    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public void setNumeroTurbinas(int numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }

    public void volar() {
        System.out.println("Volando a 30,000 pies de altura...");
    }

    @Override
    public void despegar() {
        System.out.println("Despegando jet...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Número de motores: " + getNumeroMotores());
        System.out.println("Número de turbinas: " + getNumeroTurbinas());
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo jet engine...");
    }
}