package bg.swift.lectures.classes;

/**
 * Created by Anatoli.
 */
public class ConstructorExample {
    String field;

    public ConstructorExample() {
        field = "MyValue";
    }

    public ConstructorExample(String fieldValue) {
        field = fieldValue;
    }
}
