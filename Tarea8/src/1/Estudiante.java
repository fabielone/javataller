// • Escribe y prueba una jerarquía de clases basada en la clase abstracta Persona
// con subclases Estudiante y Profesor. Se deben incluir en cada clase las variables
// de instancia mas importantes y los métodos getters, setters y toString(). Además
// se debe implementar una clase de prueba solo con método main(), donde se
// creará un objeto de tipo Estudiante y otro de tipo Profesor, después se asignarán
// datos a cada variable de instancia a través de los setters y se mostrará en la
// pantalla la información de cada objeto usando el método toString().

//estudiante

public class Estudiante extends Persona {
    private String matricula;
    private String carrera;

//   public Estudiante(Nombre nombre, Direccion direccion, Telefono telefono, Email email, String matricula, String carrera) {
//     super(nombre, direccion, telefono, email); // Pass all required arguments
//     this.matricula = matricula;
//     this.carrera = carrera;
//     }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", matricula='" + matricula + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}