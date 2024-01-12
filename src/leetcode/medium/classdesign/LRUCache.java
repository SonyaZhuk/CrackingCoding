package leetcode.medium.classdesign;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * {@link <a href="https://leetcode.com/problems/lru-cache/">146. LRU Cache</a>}.
 */
public class LRUCache {
    private int capacity;
    private Map<Integer, Integer> cacheMap;

    public LRUCache(int capacity) {
        if (capacity <= 0)
            throw new UnsupportedOperationException();

        this.capacity = capacity;
        this.cacheMap = new LinkedHashMap<>();
    }

    public int get(int key) {
        int value = cacheMap.getOrDefault(key, -1);
        if (value != -1) put(key, value);
        return value;
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            cacheMap.remove(key);
            cacheMap.put(key, value);
            return;
        }

        if (cacheMap.size() >= capacity) {
            int oldestKey = cacheMap.keySet().iterator().next();
            cacheMap.remove(oldestKey);
        }
        cacheMap.put(key, value);
    }
}
