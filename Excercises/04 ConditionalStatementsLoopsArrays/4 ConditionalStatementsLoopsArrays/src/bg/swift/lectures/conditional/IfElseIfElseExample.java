package bg.swift.lectures.conditional;

/**
 * Created by Anatoli.
 */
public class IfElseIfElseExample {

    public static void main(String[] args) {
        int age = 18;
        if (age > 18) {
            System.out.println("I can drink");
        } else if (age < 18) {
            System.out.println("I cannot drink");
        } else {
            System.out.println("I am 18 years old");
        }
    }
}
