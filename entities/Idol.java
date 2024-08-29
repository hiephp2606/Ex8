package entities;

import java.util.List;

public class Idol extends BaseEntity{
    private static List<Follower> followers;
    private String group;
    private String email;


    public Idol(String name, String group, String email) {
        super(name);
        this.group = group;
        this.email = email;
    }

    public List<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol [" +
                ", name: " + getName() + '\'' +
                ", group: " + group + '\'' +
                ", followers: " + followers + '\'' +
                ", email: " + email + '\'' +
                "]";
    }
}
