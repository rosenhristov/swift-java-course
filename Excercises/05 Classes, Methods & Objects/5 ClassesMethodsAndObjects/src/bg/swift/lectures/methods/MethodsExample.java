package bg.swift.lectures.methods;

/**
 * Created by Anatoli.
 */
public class MethodsExample {

    public static void main(String[] args) {
        // JAVA entry point
        System.out.println(calculateSum());
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateSum(int ... elements) {

        int sum = 0;

        for (int element : elements) {
            sum += element;
        }

        return sum;

    }

    public static int methodOverloading(int arg) {
        return arg;
    }
    public static String methodOverloading(String arg) {
        return arg;
    }

    /*public static void methodOverloading(int arg) {
        return;
    }*/

    public static void methodOverloading(long arg) {
        return;
    }
}
