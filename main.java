import entities.Follower;
import entities.Idol;
import entities.Song;
import entities.Tiktok;
import service.FollowersService;
import service.IdolService;
import service.SongService;
import service.TiktokService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Setup idols");
        while (true) {
            IdolService idolService = new IdolService();
            Idol idol = idolService.idol(sc);


//            setup followers
            System.out.println("Setup followers");
            while (true) {
                FollowersService followersService = new FollowersService();
                Follower follower = followersService.followers(sc);
                System.out.println("Ban co muon setup follower tiep khong? (Y/N)");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("y")) {}
                else {
                    break;
                }
            }




            System.out.println("Ban co muon setup idol tiep khong? (Y/N) ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {}
            else {
                break;
            }
        }

        System.out.println("Setup songs");
        while (true) {
            SongService songService = new SongService();
            Song song = songService.songs(sc);
            System.out.println("Ban co muon setup song tiep khong? (Y/N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {}
            else {
                break;
            }
        }

        TiktokService tiktokService = new TiktokService();
        Tiktok tiktok = tiktokService.tiktok();
        System.out.println(tiktok);
    }
}
