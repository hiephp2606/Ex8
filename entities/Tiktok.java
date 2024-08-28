package entities;

import java.util.List;

public class Tiktok {
    private List<Idol> idols;
    private List<Song> songs;


    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }


}
