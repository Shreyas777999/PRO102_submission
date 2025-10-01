package sacsors;
import java.io.Serializable;

public class Farm implements Serializable {
    private String id;
    private String name;

    public Farm(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    @Override
    public String toString() { return id + " - " + name; }
}
