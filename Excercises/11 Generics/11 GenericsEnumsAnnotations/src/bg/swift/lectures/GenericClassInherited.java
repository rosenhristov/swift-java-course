package bg.swift.lectures;

/**
 * Created by Anatoli on 01-Mar-16.
 */
public class GenericClassInherited<K, V> implements GenericInterface<K, V> {


    public static void main(String[] args) {
        GenericClassInherited<String, Integer> o = new GenericClassInherited<>();
        o.put("One", 1);
    }

    @Override
    public void put(K k, V v) {

    }

    @Override
    public V get(K k) {
        return null;
    }
}
