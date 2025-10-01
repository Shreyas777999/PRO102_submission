package sacsors;

import java.util.ArrayList;

public class StatsCalculator {
    public static double min(ArrayList<Double> values) {
        return values.stream().mapToDouble(v -> v).min().orElse(0);
    }

    public static double max(ArrayList<Double> values) {
        return values.stream().mapToDouble(v -> v).max().orElse(0);
    }

    public static double avg(ArrayList<Double> values) {
        return values.stream().mapToDouble(v -> v).average().orElse(0);
    }
}
