package bg.swift.lectures.casts;

/**
 * Created by Rossen on 30.01.2016
 */
public class MixedCasts {

    public static void main(String[] args) {
        double x = 10.0;
        double y = 3.0;
        int i = (int) (x / y);
        System.out.println("result: " + i);


        int var1 = 12;
        double var2 = 45.8921;
        double result = var1 + var2;
        System.out.println("result: " + result);

        char letter = 65;
        System.out.println("The letter is " + letter);
    }
}
