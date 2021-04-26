package bg.swift.lectures.loops;

/**
 * Created by Anatoli.
 */
public class DoWhileLoopExample {
    public static void main(String[] args) {
        // Initialize the counter
        int counter = 0;

        do {
            // Execute statements in loop if the result is true
            System.out.printf("Number: %d%n", counter);
            // Change the counter
            counter++;
        } while (counter < 10);
    }
}
