package bg.swift.lectures.loops;

/**
 * Created by Anatoli.
 */
public class WhileLoopExample {
    public static void main(String[] args) {

        // Initialize the counter
        int counter = 0;

        // Check the loop condition
        while (counter < 10) {

            // Execute statements in loop if the result is true
            System.out.printf("Number: %d%n", counter);
            // Change the counter
            counter++;
        }
    }
}
