import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> itemMap;

    public ShoppingCart() {
        itemMap = new HashMap<>();
    }

    public void add(String product, int price) {
        if (itemMap.containsKey(product)) {
            itemMap.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            itemMap.put(product, item);
        }
    }

    public int price() {
        int price = 0;

        for (Item item : itemMap.values()) {
            price += item.price();
        }

        return price;
    }

    public void print() {
        for (Item item : itemMap.values()) {
            System.out.println(item);
        }
    }
}
