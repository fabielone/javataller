public class Oncologo extends Medico {
     private String hospital;

    public Oncologo(String nombre, String apellido, int edad, double salario, String especialidad, String universidad, String hospital) {
        super(nombre, apellido, edad, salario, hospital, especialidad);
       this.hospital = hospital;
    }
 public String getHospital() {
        return hospital;
    }
    
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public void mostrarDatos() {
     super.mostrarDatos();
        System.out.println("Hospital: " + hospital);
    }

   
    public void tratarPaciente() {
        System.out.println("Tratando paciente con cáncer...");
    }

    @Override
    public void trabajar() {
        System.out.println("Realizando quimioterapia...");
    }
}