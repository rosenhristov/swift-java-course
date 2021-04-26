package bg.swift.lectures;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anatoli on 01-Mar-16.
 */
public class GenericClass<K, V> {
    private Map<K, V> keyValue = new HashMap<>();

    public void put(K k, V v) {
        keyValue.put(k, v);
    }

    public V get(K k) {
        return keyValue.get(k);
    }
}
