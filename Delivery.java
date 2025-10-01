package sacsors;
import java.io.Serializable;

public class Delivery implements Serializable {
    private String dairyId;
    private double quantity;

    public Delivery(String dairyId, double quantity) {
        this.dairyId = dairyId;
        this.quantity = quantity;
    }
    public String getDairyId() { return dairyId; }
    public double getQuantity() { return quantity; }
}
