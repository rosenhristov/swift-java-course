package bg.swift.lectures.classes.inner;

/**
 * Created by Anatoli on 18-Feb-16.
 */
public class InnerInnerClass {
    class Inner1 {

    }

    class Inner2 extends Inner1 {

    }

    public static void main(String[] args) {
        InnerInnerClass obj = new InnerInnerClass();

        Inner1 inner1 = obj.new Inner1();
        Inner1 inner2 = obj.new Inner2();
    }
}
