public class Cardiologo extends Medico {
     private String hospital;

    public Cardiologo(String nombre, String apellido, int edad, double salario, String especialidad, String universidad, String hospital) {
        super(nombre, apellido, edad, salario, "Cardiología", "Cardiología General");
        this.hospital = hospital;
    }
    public String getHospital() {
        return hospital;
    }
    
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    


    @Override
    public void trabajar() {
        System.out.println("Operando el corazón...");
    }

    @Override
    public void mostrarDatos() {
          super.mostrarDatos();
        System.out.println("Hospital: " + hospital);
    }
}