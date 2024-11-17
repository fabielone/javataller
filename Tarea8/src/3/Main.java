
import java.util.ArrayList;

// • Escribe y prueba una jerarquía de clases basada en la clase abstracta Personal
// de salud, Médico, Enfermera(o) e incluya 5 subclases de Médico y 3 de
// Enfermera(o). Escribe una clase de prueba instanciando un objeto de cada clase
// concreta.

public class Main {
    public static void main(String[] args) {
        Cirujano cirujano = new Cirujano("Juan", "Pérez", 40,90000.00, "Cirujano", "UABC", "Excel");
        Pediatra pediatra = new Pediatra("Luis", "González", 30, 80000.00, "Pediatría", "Xochicalco", "New City");
        Cardiologo cardiologo = new Cardiologo("Ana", "Martínez", 35, 100000.00, "Cardiología", "UNAM", "Cardiología");
        Neurologo neurologo = new Neurologo("José", "Hernández", 30, 110000.00 , "Neurología", "UABC", "Neurología");
        Oncologo oncologo = new Oncologo("María", "González", 40,120000.00, "Oncología", "Xochicalco", "Oncología");
        EnferAdultosMayores enferAdultosMayores = new EnferAdultosMayores("María", "González", 40, 50000.00,  "Adultos Mayores", 10, "Enfermera Adultos Mayores");
        EnferCuidadosIntensivos enferCuidadosIntensivos = new EnferCuidadosIntensivos("José", "Hernández", 30,  40000.00, "Enfermero Cuidados Intensivos","excel");
        EnferQuirurgico enferQuirurgicos = new EnferQuirurgico("Ana", "Martínez", 35, 4004.00, "Enfermera Quirúrgico","New City");

        ArrayList<Personal> personalSalud = new ArrayList<>();
        personalSalud.add(cirujano);
        personalSalud.add(pediatra);
        personalSalud.add(cardiologo);
        personalSalud.add(neurologo);
        personalSalud.add(oncologo);
        personalSalud.add(enferAdultosMayores);
        personalSalud.add(enferCuidadosIntensivos);
        personalSalud.add(enferQuirurgicos);

     

        for (Personal personal : personalSalud) {
            personal.mostrarDatos();
            personal.trabajar();
            System.out.println();
        }

    }
}
