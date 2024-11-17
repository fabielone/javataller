// Modifique la clase MockSongs para utilizar "List.of" en vez del método "add" al llenar la lista con las canciones.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MockSongs mockSongs = new MockSongs();
        List<Song> songs = mockSongs.getSongs();
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}


                                      