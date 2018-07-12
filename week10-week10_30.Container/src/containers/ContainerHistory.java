package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double d = Collections.max(history);
        return d;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double d = Collections.min(history);
        return d;
    }

    public double average() {
        double sum = 0, average = 0;
        if (this.history.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < history.size(); i++) {
            sum += history.get(i);
        }
        average = sum / history.size();
        return average;
    }

    public double greatestFluctuation() {
        List<Double> maxFluctuation = new ArrayList<Double>();
        double maxF = 0;
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        } else {
            for (int i = 0; i < history.size(); i++) {
                if (i != history.size() - 1) {
                    maxF = Math.abs(history.get(i) - history.get(i + 1));
                    maxFluctuation.add(maxF);
                } else {
                    maxF = Math.abs(history.get(i - 1) - history.get(i));
                    maxFluctuation.add(maxF);
                }

            }
        }
        /*for (int i = 0; i < history.size(); i++) {
            history.set(i, Math.abs(history.get(i)));
        }*/

        //double min = Collections.min(history);
        double max = Collections.max(maxFluctuation);
        return max;
    }

    public double variance() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        }
        double variance = 0, help = 0, average = this.average();
        for (double d : history) {
            help += (Math.pow((d - average), 2));
            variance = help / (history.size() - 1);
        }
        return variance;
    }

    @Override
    public String toString() {

        return history.toString();
    }
}
