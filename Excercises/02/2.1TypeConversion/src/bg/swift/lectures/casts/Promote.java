package bg.swift.lectures.casts;

/**
 * Created by Rossen on 30.01.2016
 *
 * Promotion rules that apply to expressions:
 * - all byte and short values are promoted to int
 * - If one operand is long, the whole expression is promoted to long
 * - If one operand is a float, the whole expression is promoted to float
 * - If one operand is double, the whole expression is promoted to double
 */
class Promote {
    public static void main(String args[]) {
        byte b = 12;
        char c = 'A';
        short s = 1004;
        int i = 20000;
        float f = 5.67f;
        double d = .1234;
        double res = (f * b) + (i / c) - (d * s);
        System.out.println("result: " + res);
    }
}
