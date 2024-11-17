public class Song {
   private String titulo;
    private String artista;
    private int duracion;

    public Song(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Song{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", duracion=" + duracion +
                '}';
    }

}