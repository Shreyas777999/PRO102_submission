package sacsors;
import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    public static <T> void saveData(ArrayList<T> list, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> ArrayList<T> loadData(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<T>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<T>();
        }
    }
}
