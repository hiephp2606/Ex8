package entities;

public class Song extends BaseEntity {
    private String singer;

    public Song(String name, String singer) {
        super(name);
        this.singer = singer;
    }
}
