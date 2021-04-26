package bg.swift.lectures.enums;

import bg.swift.lectures.GenericInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anatoli on 01-Mar-16.
 */
public enum EnumGenerics implements GenericInterface<String, Integer> {
    ONE("One", 1);

    Map<String, Integer> map = new HashMap<>();

    EnumGenerics(String key, Integer value) {
        this.put(key,value);
    }

    @Override
    public void put(String s, Integer integer) {
        map.put(s, integer);
    }

    @Override
    public Integer get(String s) {
        return null;
    }
}
