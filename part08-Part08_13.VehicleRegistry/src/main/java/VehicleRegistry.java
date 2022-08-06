import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleMap;

    public VehicleRegistry() {
        this.vehicleMap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleMap.containsKey(licensePlate)) {
            return false;
        }

        vehicleMap.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return vehicleMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleMap.containsKey(licensePlate)) {
            vehicleMap.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : vehicleMap.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerNames = new ArrayList<>();

        for (String owner : vehicleMap.values()) {
            if (!(ownerNames.contains(owner))) {
                System.out.println(owner);
                ownerNames.add(owner);
            }
        }
    }
}
