// Escribe y prueba una clase compuesta (que incluye objetos de otras
// clases) que represente una Persona con su nombre, dirección, teléfono,
// email. Cada uno de estos atributos serán objetos de las clases Nombre,
// Direccion, Telefono, Email. Agrega getters, setters y toString en cada
// clase. Escribe una clase de prueba instanciando un objeto Persona.

// • La clase Nombre debe incluir: primer nombre, segundo nombre,
// apellido paterno, apellido materno y apodo.

// • La clase Direccion debe incluir: calle, numero exterior, numero
// interior, colonia, código postal, ciudad, estado y país.

// • La clase Telefono debe incluir: código de país, código de área y
// número de teléfono.

// • La clase Email debe incluir: usuario y dominio.


class Nombre {
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String apodo;

    public Nombre(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String apodo) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.apodo = apodo;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Nombre{" +
                "primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", apodo='" + apodo + '\'' +
                '}';
    }
}

class Direccion {
    private String calle;
    private String numeroExterior;
    private String numeroInterior;
    private String colonia;
    private String codigoPostal;
    private String ciudad;
    private String estado;
    private String pais;

    public Direccion(String calle, String numeroExterior, String numeroInterior, String colonia, String codigoPostal, String ciudad, String estado, String pais) {
        this.calle = calle;
        this.numeroExterior = numeroExterior;
        this.numeroInterior = numeroInterior;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public String getNumeroInterior() {
        return numeroInterior;
    }

    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numeroExterior='" + numeroExterior + '\'' +
                ", numeroInterior='" + numeroInterior + '\'' +
                ", colonia='" + colonia + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' + 
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}

class Telefono {
    private String codigoPais;
    private String codigoArea;
    private String numeroTelefono;

    public Telefono(String codigoPais, String codigoArea, String numeroTelefono) {
        this.codigoPais = codigoPais;
        this.codigoArea = codigoArea;
        this.numeroTelefono = numeroTelefono;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "codigoPais='" + codigoPais + '\'' +
                ", codigoArea='" + codigoArea + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}

class Email {
    private String usuario;
    private String dominio;

    public Email(String usuario, String dominio) {
        this.usuario = usuario;
        this.dominio = dominio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    @Override
    public String toString() {
        return "Email{" +
                "usuario='" + usuario + '\'' +
                ", dominio='" + dominio + '\'' +
                '}';
    }
}

class Persona {
    private Nombre nombre;
    private Direccion direccion;
    private Telefono telefono;
    private Email email;

    public Persona(Nombre nombre, Direccion direccion, Telefono telefono, Email email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre +
                ", direccion=" + direccion +
                ", telefono=" + telefono +
                ", email=" + email +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Nombre nombre = new Nombre("Juan", "Pablo", "García", "Pérez", "Juanpa");
        Direccion direccion = new Direccion("Calle 1", "123", "A", "Colonia 1", "12345", "Ciudad 1", "Estado 1", "País 1");
        Telefono telefono = new Telefono("52", "55", "12345678");
        Email email = new Email("juanpa", "gmail.com");

        Persona persona = new Persona(nombre, direccion, telefono, email);

        System.out.println(persona);
    }
}