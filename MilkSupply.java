package sacsors;
import java.io.Serializable;

public class MilkSupply implements Serializable {
    private String farmId;
    private double quantity;

    public MilkSupply(String farmId, double quantity) {
        this.farmId = farmId;
        this.quantity = quantity;
    }
    public String getFarmId() { return farmId; }
    public double getQuantity() { return quantity; }
}
