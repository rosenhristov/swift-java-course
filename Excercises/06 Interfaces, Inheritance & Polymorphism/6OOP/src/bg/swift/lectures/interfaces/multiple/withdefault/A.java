package bg.swift.lectures.interfaces.multiple.withdefault;

public interface A {
    default void hi() {
        System.out.println("A");
    }

}
