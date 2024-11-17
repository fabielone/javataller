// • Escribe y prueba una jerarquía de clases basada en la clase abstracta Persona
// con subclases Estudiante y Profesor. Se deben incluir en cada clase las variables
// de instancia mas importantes y los métodos getters, setters y toString(). Además
// se debe implementar una clase de prueba solo con método main(), donde se
// creará un objeto de tipo Estudiante y otro de tipo Profesor, después se asignarán
// datos a cada variable de instancia a través de los setters y se mostrará en la
// pantalla la información de cada objeto usando el método toString().

public class Profesor extends Persona {
    private String numeroEmpleado;
    private String departamento;

    // public Profesor(Nombre nombre, Direccion direccion, Telefono telefono, Email email, String numeroEmpleado, String departamento) {
    //     super(nombre, direccion, telefono, email); // Pass all required arguments
    //     this.numeroEmpleado = numeroEmpleado;
    //     this.departamento = departamento;
    // }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", numeroEmpleado='" + numeroEmpleado + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}

