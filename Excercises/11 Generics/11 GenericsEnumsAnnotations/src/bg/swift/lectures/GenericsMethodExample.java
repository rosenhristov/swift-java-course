package bg.swift.lectures;

public class GenericsMethodExample {

    public static <T> T genericMethod(T param) {
        System.out.println(param + " has type " +
                param.getClass().getName());

        return param;
    }

    public static void main(String[] args) {
        GenericsMethodExample.<String>genericMethod("some string");
        GenericsMethodExample.genericMethod("some string");
        GenericsMethodExample.genericMethod(10);
    }
}
