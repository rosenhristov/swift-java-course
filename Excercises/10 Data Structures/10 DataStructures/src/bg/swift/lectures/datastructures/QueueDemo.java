package bg.swift.lectures.datastructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Anatoli.
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");

        while (queue.size() > 0) {
            Object msg = queue.poll();
            System.out.println(msg);
        }
    }
}
