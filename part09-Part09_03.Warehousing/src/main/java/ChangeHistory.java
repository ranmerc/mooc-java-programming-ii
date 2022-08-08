import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeList;

    public ChangeHistory() {
        this.changeList = new ArrayList<>();
    }

    public void add(double status) {
        this.changeList.add(status);
    }

    public void clear() {
        this.changeList.clear();
    }

    public double maxValue() {
        if (this.changeList.isEmpty()) {
            return 0;
        }

        double maxValue = this.changeList.get(0);

        for (double value : this.changeList) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public double minValue() {
        if (this.changeList.isEmpty()) {
            return 0;
        }

        double minValue = this.changeList.get(0);

        for (double value : this.changeList) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public double average() {
        if (this.changeList.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (double value : this.changeList) {
            sum += value;
        }

        return sum / this.changeList.size();
    }

    @Override
    public String toString() {
        return this.changeList.toString();
    }
}
