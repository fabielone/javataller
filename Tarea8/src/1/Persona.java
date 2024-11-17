

public abstract class Persona {
    private Nombre nombre;
    private Direccion direccion;
    private Telefono telefono;
    private Email email;

    // public Persona(Nombre nombre, Direccion direccion, Telefono telefono, Email email) {
    //     this.nombre = nombre;
    //     this.direccion = direccion;
    //     this.telefono = telefono;
    //     this.email = email;
    // }

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
