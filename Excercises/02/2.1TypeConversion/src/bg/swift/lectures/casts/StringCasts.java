package bg.swift.lectures.casts;

/**
 * Created by Anatoli on 30/01/2016.
 */
public class StringCasts {
    public static void main(String[] args) {
		int a = 5;
		int b = 10;
		String s = "Sum=" + (a + b);
		System.out.println(s);
		String incorrect = "Sum=" + a + b;
		System.out.println(incorrect);
		System.out.println("Perimeter = " + 2 * (a + b) + ". Area = " + (a * b) + ".");
    }
}
