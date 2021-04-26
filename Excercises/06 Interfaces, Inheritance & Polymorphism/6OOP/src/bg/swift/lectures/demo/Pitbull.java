package bg.swift.lectures.demo;

/**
 * Created by Anatoli on 11-Feb-16.
 */
public class Pitbull extends Dog {
    String name;

    public Pitbull(String name) {
        super(name);
        System.out.println("Constructor Pitbull");
    }

    public void behaviour() {
        System.out.println("Bites");
    }

    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull("Test");
        System.out.println(pitbull.name);

        Dog dog = pitbull;
        System.out.println(dog.name);

/*        Animal animal = pitbull;
        System.out.println(animal.name);*/

/*
        Dog dog = pitbull;
        System.out.println(dog.name);

        Animal animal = pitbull;
        System.out.println(animal.name);*/

    }
}
