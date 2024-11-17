public class Telefono {
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