package ir.hajitsu.prototype.registery;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private Map<Long, Item> map = new HashMap<>();

    {
        add(new Item(1L, "hajitsu"));
        add(new Item(2L, "unfaithful"));
        add(new Item(3L, "land"));
    }

    public Item get(Long id) {
        if (map.containsKey(id)) {
            return map.get(id).clone();
        }
        return null;
    }

    public void add(Item item) {
        map.put(item.getId(), item);
    }
}
