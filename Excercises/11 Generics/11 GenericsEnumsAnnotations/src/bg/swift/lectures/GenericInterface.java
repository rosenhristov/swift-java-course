package bg.swift.lectures;

/**
 * Created by Anatoli on 01-Mar-16.
 */
public interface GenericInterface<K, V> {
    void put(K k, V v);
    V get(K k);
}
