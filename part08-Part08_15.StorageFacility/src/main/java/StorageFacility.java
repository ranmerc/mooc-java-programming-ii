import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageMap;

    public StorageFacility() {
        this.storageMap = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageMap.putIfAbsent(unit, new ArrayList<>());

        this.storageMap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageMap.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {

        this.storageMap.get(storageUnit).remove(item);

        if (this.storageMap.get(storageUnit).isEmpty()) {
            this.storageMap.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();

        for (String unit : this.storageMap.keySet()) {
            storageUnits.add(unit);
        }

        return storageUnits;
    }
}