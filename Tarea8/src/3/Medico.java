public abstract class Medico extends Personal {
    private String especialidad;
    private String universidad;

    public Medico(String nombre, String apellido, int edad, double salario, String especialidad, String universidad) {
        super(nombre, apellido, edad, salario);
        this.especialidad = especialidad;
        this.universidad = universidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
    public abstract void trabajar();

  

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Universidad: " + universidad);
    }
}