public class EnferAdultosMayores extends Enfermero {
    private int aniosExperiencia;
    private String especialidad;

    public EnferAdultosMayores(String nombre, String apellido, int edad, double salario, String especialidadGeneral, int aniosExperiencia, String especialidad) {
        super(nombre, apellido, edad, salario, especialidadGeneral);
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.println("Atendiendo a adultos mayores...");
    }
    @Override
    public void atender() {
        System.out.println("Atendiendo a adultos mayores...");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Años de experiencia: " + aniosExperiencia);
        System.out.println("Especialidad: " + especialidad);
    }

    public void cuidar() {
        System.out.println("Cuidando a los adultos mayores...");
    }

    public void administrarMedicamentos() {
        System.out.println("Administrando medicamentos...");
    }

    public void tomarSignosVitales() {
        System.out.println("Tomando signos vitales...");
    }

    public void realizarTerapiaFisica() {
        System.out.println("Realizando terapia física...");
    }
}