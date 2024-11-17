// • Escribe y prueba una clase que represente una Persona. La clase debe incluir:
// • Variables de instancia para el nombre, apellido paterno, apellido materno, fecha de nacimiento, curp, rfc, estatura, peso.
// • Métodos getters y setters, que verifiquen valores válidos.
// • Un método toString() que regrese una cadena (String) con el nombre completo de la persona y todos sus datos.

class Fecha{
    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year){
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getYear(){
        return year;
    }

    public void setDia(int dia){
        if(dia > 0 && dia <= 31){
            this.dia = dia;
        }
    }

    public void setMes(int mes){
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }
    }

    public void setYear(int year){
        if(year > 0){
            this.year = year;
        }
    }

    public String toString(){
        return dia + " de " + mes + " de " + year;
    }
}

class Persona{
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Fecha fechaNacimiento;
    private String curp;
    private String rfc;
    private double estatura;
    private double peso;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, String curp, String rfc, double estatura, double peso){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
        this.rfc = rfc;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidoPaterno(){
        return apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return apellidoMaterno;
    }

    public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }

    public String getCurp(){
        return curp;
    }

    public String getRfc(){
        return rfc;
    }

    public double getEstatura(){
        return estatura;
    }

    public double getPeso(){
        return peso;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCurp(String curp){
        this.curp = curp;
    }

    public void setRfc(String rfc){
        this.rfc = rfc;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String toString(){
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno + "\n" + fechaNacimiento + "\n" + curp + "\n" + rfc + "\n" + estatura + " m\n" + peso + " kg";
    }
}

public class Main{
    public static void main(String[] args){
        Fecha f = new Fecha(1, 1, 2000);
        Persona p = new Persona("Juan", "Pérez", "García", f, "PEGA000101HDFRRC00", "PEGA000101", 1.75, 70);
        System.out.println(p);
    }
}