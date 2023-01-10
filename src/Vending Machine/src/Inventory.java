import java.util.HashMap;
import java.util.Map;

public class Inventory<Item> {
    private Map<Item, Integer> inventory = new HashMap<>();


    public void add(Item item) {
        inventory.put(item, inventory.getOrDefault(item, 0) + 1);
    }

    public void reduce(Item item) {
        if(inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) - 1);
        }
    }

    public int getQuantity(Item item) {
        if(inventory.containsKey(item)) {
            return inventory.get(item) ;
        }
        return 0;
    }
}
