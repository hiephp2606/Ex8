package entities;

import java.util.List;

public class Tiktok {
    private List<Idol> idols ;
    private List<Song> songs;

    public Tiktok(List<Idol> idols, List<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public List<Idol> getIdols() {
        return idols;
    }

    public void setIdols(List<Idol> idols) {
        this.idols = idols;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void list() {
        System.out.println(idols);
        System.out.println(songs);
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
