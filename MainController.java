package sacsors;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;

public class MainController {
    @FXML private TextField farmId, farmName;
    @FXML private TextArea output;

    private ArrayList<Farm> farms = new ArrayList<>();

    @FXML
    private void addFarm() {
        Farm f = new Farm(farmId.getText(), farmName.getText());
        farms.add(f);
        output.appendText("Added Farm: " + f + "\n");
        FileHandler.saveData(farms, "farms.dat");
    }

    @FXML
    private void loadFarms() {
        farms = FileHandler.loadData("farms.dat");
        output.appendText("Loaded " + farms.size() + " farms.\n");
    }
}
