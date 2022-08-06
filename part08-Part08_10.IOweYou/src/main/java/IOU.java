import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> oweRecordMap;

    public IOU() {
        this.oweRecordMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.oweRecordMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.oweRecordMap.getOrDefault(toWhom, 0.0);
    }
}
