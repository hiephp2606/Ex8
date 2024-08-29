package service;

import entities.Follower;

import java.util.Scanner;

public class FollowersService {
    public Follower followers (Scanner scanner) {
        System.out.println("Nhap ten tai khoan: ");
        String name = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap so like: ");
        int like = Integer.parseInt(scanner.nextLine());

        return new Follower(name, email, like);
    }
}
