
import java.util.ArrayList;

// Escribe y prueba una jerarquía de clases basada en las clases abstractas
// Vehículo, Vehículo Aereo, Vehículo Terrestre, Vehículo Marino y las clases
// concretas Automovil, Trailer, Motocicleta, Lancha, Yate, Avión, Helicoptero, etc.,
// etc., etc. Debe haber por lo menos 4 clases concretas para cada tipo de Vehículo
// (4 aereos, 4 terrestres y 4 marinos). Escribe una clase de prueba instanciando un
// objeto de cada clase concreta.

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Ford", "Fiesta", 2021, 20000, 4, 4);
        Trailer trailer = new Trailer("Kenworth", "T680", 2021, 100000, 1, 2);
        Motocicleta motocicleta = new Motocicleta("Harley-Davidson", "Sportster", 2021, 30000, 2, 1000);
        Camion camion = new Camion("Volvo", "VNL", 2021, 150000, 4, 2);
        Lancha lancha = new Lancha("Yamaha", "242X", 2021, 50000, 2, 10);
        Yate yate = new Yate("Azimut", "S6", 2021, 1000000, 2, 5);
        Barco barco = new Barco("Ferretti", "Yachts 500", 2021, 500000, 2, 3);
        Ferry ferry = new Ferry("Ferry", "Ferry", 2021, 1000000, 4, 100, 50);
        Avion avion = new Avion("Boeing", "747", 2021, 10000000, 4, 2);
        Helicoptero helicoptero = new Helicoptero("Bell", "505", 2021, 500000, 1, 4);
        Jet jet = new Jet("Cessna", "Citation", 2021, 2000000, 2, 8);
        Bomber bomber = new Bomber("Boeing", "B-52", 2021, 100000000, 8, 10);

      //use arraylist to iterate over all of them 

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(automovil);
        vehiculos.add(trailer);
        vehiculos.add(motocicleta);
        vehiculos.add(camion);
        vehiculos.add(lancha);
        vehiculos.add(yate);
        vehiculos.add(barco);
        vehiculos.add(ferry);
        vehiculos.add(avion);
        vehiculos.add(helicoptero);
        vehiculos.add(jet);
        vehiculos.add(bomber);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDatos();
            vehiculo.encender();
            System.out.println();
        }
    }
}
