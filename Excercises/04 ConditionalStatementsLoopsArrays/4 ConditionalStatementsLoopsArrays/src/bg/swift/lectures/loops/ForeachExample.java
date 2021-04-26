package bg.swift.lectures.loops;

/**
 * Created by Anatoli.
 */
public class ForeachExample {
    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        for (String element : stringArray) {
            System.out.printf("%s%n", element);
        }
    }
}
