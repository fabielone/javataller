public abstract class Personal {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Personal(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void trabajar();

    public abstract void mostrarDatos();
}