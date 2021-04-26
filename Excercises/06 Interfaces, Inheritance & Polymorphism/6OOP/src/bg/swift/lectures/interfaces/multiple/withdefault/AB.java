package bg.swift.lectures.interfaces.multiple.withdefault;

public class AB implements A, B {

    public void hi() { A.super.hi(); }

    public static void main(String[] args) {
        new AB().hi(); // won't compile.
    }
}
