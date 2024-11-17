import java.util.List;

public class MockSongs {
    private List<Song> songs;

    public MockSongs() {
        songs = List.of(
            new Song("Song 1", "Artist 1", 1),
            new Song("Song 2", "Artist 2", 2),
            new Song("Song 3", "Artist 3", 3),
            new Song("Song 4", "Artist 4", 4),
            new Song("Song 5", "Artist 5", 5)
        );
    }

    public List<Song> getSongs() {
        return songs;
    }
}