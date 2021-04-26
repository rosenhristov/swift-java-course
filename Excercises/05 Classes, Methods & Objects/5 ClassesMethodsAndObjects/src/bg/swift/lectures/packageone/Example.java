package bg.swift.lectures.packageone;

/**
 * Created by Anatoli on 09-Feb-16.
 */
public class Example {
    public static void main(String[] args) {
        OneOne oneone = new OneOne();
        //oneone.privateField = 6;
        oneone.publicField = 6;
        oneone.protectedField = 6;
        oneone.defaultScopeField = 6;

        OneTwo oneTwo = new OneTwo();
        //oneTwo.privateField = 6;
        oneTwo.publicField = 6;
        oneTwo.protectedField = 6;
        oneTwo.defaultScopeField = 6;
    }
}
