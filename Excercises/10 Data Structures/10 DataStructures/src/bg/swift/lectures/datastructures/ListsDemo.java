package bg.swift.lectures.datastructures;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Anatoli.
 */
public class ListsDemo {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("Hello");
        list.add(5);
        list.add(3.14159);
        list.add(new Date());

        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.printf("Index=%d; Value=%s\n", i, value);
        }
    }
}
