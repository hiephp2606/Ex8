package service;

import entities.BaseEntity;
import entities.Follower;
import entities.Idol;

import java.util.List;
import java.util.Scanner;

public class IdolService {
    Scanner sc;
    public Idol idol (Scanner sc) {
        System.out.printf("Nhap ten idol: ");
        String name = sc.nextLine();
        System.out.printf("Nhap gene nhac: ");
        String group = sc.nextLine();
        System.out.printf("Nhap email: ");
        String email = sc.nextLine();

        return new Idol(name, group, email);
    }
}
