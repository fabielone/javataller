public abstract class Enfermero extends Personal {
    private String especialidad;

    public Enfermero(String nombre, String apellido, int edad, double salario, String especialidad) {
        super(nombre, apellido, edad, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.println("Atendiendo pacientes...");
    }

    public abstract void atender();

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Especialidad: " + especialidad);
    }
}