package service;

import entities.Idol;
import entities.Song;
import entities.Tiktok;

import java.util.List;

public class TiktokService {
    public Tiktok tiktok () {
        List<Idol> idols;
        List<Song> songs;
    return new Tiktok(idols, songs);
    }
}
