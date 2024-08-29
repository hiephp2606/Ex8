package entities;

public class Follower extends BaseEntity {
    private int NumberOfLike;
    private String email;

    public Follower(String name, String email, int numberOfLike ) {
        super(name);
        NumberOfLike = numberOfLike;
        this.email = email;
    }
}
