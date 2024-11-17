public class EnferQuirurgico extends Enfermero {
    private String especialidad;

    public EnferQuirurgico(String nombre, String apellido, int edad, double salario, String especialidad, String hospital) {
        super(nombre, apellido, edad,salario, "default");
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void atender() {
        System.out.println("Atendiendo a paciente en quirófano...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + especialidad);
    }
}