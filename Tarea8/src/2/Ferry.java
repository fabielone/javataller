public class Ferry extends VehiculoMarino {
    private int capacidadPasajeros;
    private int capacidadVehiculos;
    private int cantidadPasajeros;
    private int cantidadVehiculos;

    public Ferry(String marca, String modelo, int anio, double precio, int numeroMotores, int capacidadPasajeros, int capacidadVehiculos) {
        super(marca, modelo, anio, precio, numeroMotores);
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public void abordarPasajero() {
        if (cantidadPasajeros < capacidadPasajeros) {
            cantidadPasajeros++;
            System.out.println("Pasajero abordado.");
        } else {
            System.out.println("No hay espacio para más pasajeros.");
        }
    }   

    public void abordarVehiculo() {
        if (cantidadVehiculos < capacidadVehiculos) {
            cantidadVehiculos++;
            System.out.println("Vehículo abordado.");
        } else {
            System.out.println("No hay espacio para más vehículos.");
        }
    }

    @Override
    public void navegar() {
        System.out.println("Navegando ferry...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAnio());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Número de motores: " + getNumeroMotores());
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
        System.out.println("Capacidad de vehículos: " + capacidadVehiculos);
        System.out.println("Cantidad de pasajeros: " + cantidadPasajeros);
        System.out.println("Cantidad de vehículos: " + cantidadVehiculos);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motores de ferry...");
    }
}