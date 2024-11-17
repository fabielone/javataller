public class Neurologo extends Medico {
    private String hospital;

    public Neurologo(String nombre, String apellido, int edad, double salario, String especialidad, String universidad, String hospital) {
        super(nombre, apellido, edad, salario, especialidad, universidad);
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

    @Override
    public void trabajar() {
        System.out.println("Realizando cirugía cerebral...");
    }

    
    public void tratarPaciente() {
        System.out.println("Realizando examen neurológico...");
    }
}