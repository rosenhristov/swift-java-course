package bg.swift.lectures.exercise.two;


import java.util.NoSuchElementException;

/**
 * Created by Anatoli on 23-Feb-16.
 */
public class SingleLinkedList {
    static class Item {
        Object data;
        Item next;

        public Item(Object data) {
            this(data, null);
        }
        public Item(Object data, Item next) {
            this.data = data;
            this.next = next;
        }
        public Item getNext() {
            return next;
        }
        public void setNext(Item next) {
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }

    Item head;
    int length;

    public SingleLinkedList() {
        this.length = 0;
    }

    public void addLast(Object data) {
        if (head == null) {
            head = new Item(data);
            length++;
            return;
        }
        Item currentItem = head;
        while (currentItem.getNext() != null) {
            currentItem = currentItem.getNext();
        }

        currentItem.setNext(new Item(data));
        length++;
    }

    public Object getAt(int index) throws ArrayIndexOutOfBoundsException {
        if (length == 0 || length < index) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        Item itemAt = head;
        for(int i = 0; i < index; i++) {
            itemAt = itemAt.getNext();
        }

        return itemAt.getData();
    }

    public void printAll(){
        Item currentItem = head;
        while (currentItem.getNext() != null) {
            System.out.println("Current Item data: " + currentItem.getData());
            currentItem = currentItem.getNext();
        }
        System.out.println("Current Item data: " + currentItem.getData());
    }

    public Object removeLast() throws NoSuchElementException {
        Object ret;
        if (length == 0) {
            throw new NoSuchElementException();
        } else if (length == 1) {
            ret = head.getData();
            head = null;
            return ret;
        }

        Item currentItem = head;
        Item previousItem = currentItem;

        while(currentItem.getNext() != null) {
            previousItem = currentItem;
            currentItem = currentItem.getNext();
        }

        ret = currentItem.getData();
        currentItem = null;
        previousItem.setNext(currentItem);
        length--;
        return ret;
    }

}
