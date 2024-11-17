public class EnferCuidadosIntensivos extends Enfermero {
    private String hospital;
    
    public EnferCuidadosIntensivos(String nombre, String apellido, int edad, double salario, String especialidad, String hospital) {
        super(nombre, apellido, edad, salario, especialidad);
        this.hospital = hospital;
    }
    
    public String getHospital() {
        return hospital;
    }
    
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    public void cuidarPaciente() {
        System.out.println("Cuidando paciente en cuidados intensivos...");
    }
    
    @Override
    public void trabajar() {
        System.out.println("Atendiendo pacientes en el hospital...");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendiendo a paciente en cuidados intensivos...");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Hospital: " + hospital);
    }
}