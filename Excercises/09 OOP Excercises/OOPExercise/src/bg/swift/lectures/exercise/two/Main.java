package bg.swift.lectures.exercise.two;

/**
 * Created by Anatoli on 23-Feb-16.
 */
public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast("1");

        System.out.println("element:" + sll.getAt(0));
        System.out.println("element delete:" + sll.removeLast());
        sll.addLast("2");

        sll.addLast("3");
        sll.addLast("4");

        sll.printAll();
    }
}
