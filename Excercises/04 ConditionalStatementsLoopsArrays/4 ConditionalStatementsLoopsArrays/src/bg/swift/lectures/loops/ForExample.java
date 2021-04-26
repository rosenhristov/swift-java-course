package bg.swift.lectures.loops;

/**
 * Created by Anatoli.
 */
public class ForExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Number: %d%n", i);
        }

        // i no longer defined
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.printf("Number: %d%n", i);
        }
        // i still defined
        System.out.printf("i is: %d%n", i);
    }
}
