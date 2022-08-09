import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        priceMap.put(product, price);
        stockMap.put(product, stock);
    }

    public int price(String product) {
        return priceMap.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stockMap.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stockMap.containsKey(product)) {
            int currentStock = stockMap.get(product);

            if (currentStock > 0) {
                stockMap.put(product, currentStock - 1);
                return true;
            }
        }

        return false;
    }

    public Set<String> products() {
        return priceMap.keySet();
    }
}
