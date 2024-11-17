// • Escribe y prueba una jerarquía de clases basada en la clase abstracta Persona
// con subclases Estudiante y Profesor. Se deben incluir en cada clase las variables
// de instancia mas importantes y los métodos getters, setters y toString(). Además
// se debe implementar una clase de prueba solo con método main(), donde se
// creará un objeto de tipo Estudiante y otro de tipo Profesor, después se asignarán
// datos a cada variable de instancia a través de los setters y se mostrará en la
// pantalla la información de cada objeto usando el método toString().

public class Main {
    public static void main(String[] args) {

        // Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(new Nombre("Juan", "Pérez", "Gómez", "SegundoNombre", "ApellidoMaterno"));
        estudiante.setDireccion(new Direccion("Calle", "Colonia", "Municipio", "Estado", "País", "Código Postal", "Referencia", "Otra Referencia"));
        estudiante.setTelefono(new Telefono("Casa", "Celular", "Oficina"));
        estudiante.setEmail(new Email("Personal", "Trabajo"));
        estudiante.setMatricula("123 456 789");
        estudiante.setCarrera("Ingeniería en Sistemas Computacionales");



        // Profesor
        Profesor profesor = new Profesor();

        profesor.setNombre(new Nombre("Juan", "Pérez", "Gómez", "SegundoNombre", "ApellidoMaterno"));
        profesor.setDireccion(new Direccion("Calle", "Colonia", "Municipio", "Estado", "País", "Código Postal", "Referencia", "Otra Referencia"));
        profesor.setTelefono(new Telefono("Casa", "Celular", "Oficina"));
        profesor.setEmail(new Email("Personal", "Trabajo"));
        profesor.setNumeroEmpleado("123456");
        profesor.setDepartamento("Ingeniería en Sistemas Computacionales");
        

        // Mostrar información de estudiante y profesor

        System.out.println(estudiante);
        System.out.println(profesor);
    }
}