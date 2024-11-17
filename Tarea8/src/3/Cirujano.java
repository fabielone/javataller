public class Cirujano extends Medico {
    private String hospital;
    
    public Cirujano(String nombre, String apellido, int edad, double salario, String especialidad, String universidad, String hospital) {
        super(nombre, apellido, edad, salario, especialidad, universidad);
        this.hospital = hospital;
    }
    
    public String getHospital() {
        return hospital;
    }
    
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    public void operar() {
        System.out.println("Operando paciente...");
    }
    
    @Override
    public void trabajar() {
        System.out.println("Atendiendo pacientes en el hospital...");
    }
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Hospital: " + hospital);
    }
}