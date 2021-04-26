package bg.swift.lectures.interfaces.multiple.withdefault;

public interface B {
    default void hi() {
        System.out.println("B");
    }
}
