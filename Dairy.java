package sacsors;
import java.io.Serializable;

public class Dairy implements Serializable {
    private String id;
    private String location;

    public Dairy(String id, String location) {
        this.id = id;
        this.location = location;
    }
    public String getId() { return id; }
    public String getLocation() { return location; }
    @Override
    public String toString() { return id + " - " + location; }
}
