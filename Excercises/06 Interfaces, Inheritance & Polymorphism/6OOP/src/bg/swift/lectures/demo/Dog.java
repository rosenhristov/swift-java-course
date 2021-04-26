package bg.swift.lectures.demo;

/**
 * Created by Anatoli on 11-Feb-16.
 */
public class Dog extends Animal {
    String name;

    public void behaviour() {
        System.out.println("Bark");
    }

    public Dog(String name) {
        super(name);
        this.name = name;
        System.out.println("Constructor Dog");
    }

}
