package bg.swift.lectures.interfaces.multiple.withdefault;

public interface C extends A {
    default void hi() {
        System.out.println("C");
    }
}
