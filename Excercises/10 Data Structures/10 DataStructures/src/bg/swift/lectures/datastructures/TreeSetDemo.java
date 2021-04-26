package bg.swift.lectures.datastructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Anatoli.
 */
public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Object> treeSet = new TreeSet<Object>();
        List treeSet2 = new LinkedList();

        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(3);

        treeSet.remove(6);

        treeSet2.add(4);

        treeSet2.add(3);

        treeSet.addAll(treeSet2);

        for (Object i : treeSet) {
            System.out.printf(" %s", String.valueOf(i));
        }

        // Result:  1 3 5 8
    }
}
