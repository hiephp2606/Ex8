package service;

import entities.Song;

import java.util.Scanner;

public class SongService {
    public Song songs (Scanner scanner) {
        System.out.printf("Nhap ten bai hat: ");
        String name = scanner.nextLine();
        System.out.printf("Nhap ten ca si: ");
        String songName = scanner.nextLine();

        return new Song(name, songName);
    }
}
