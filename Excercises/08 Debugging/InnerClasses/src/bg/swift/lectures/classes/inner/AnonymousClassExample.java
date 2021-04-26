package bg.swift.lectures.classes.inner;


public class AnonymousClassExample {

    public static void main(String[] args) {

        new Object() {
            void printSomething() {
                System.out.println("I am anonymous class.");
            }
        }.printSomething();

    }
}
