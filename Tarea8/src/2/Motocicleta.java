public class Motocicleta extends VehiculoTerrestre {
    private int cilindraje;

    public Motocicleta(String marca, String modelo, int anio, double precio, int numeroLlantas, int cilindraje) {
        super(marca, modelo, anio, precio, numeroLlantas);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public void rodar() {
        System.out.println("Rodando en dos ruedas...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Número de llantas: " + getNumeroLlantas());
        System.out.println("Cilindraje: " + cilindraje);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor de motocicleta...");
    }
}