package entities;

public class BaseEntity {
    private String name;
    private static int autoId;
    private int id;


    public BaseEntity(String name) {
        super();
        this.name = name;
        this.id = ++autoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        BaseEntity.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
