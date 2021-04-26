package bg.swift.lectures.annotation;

@AuthorInfo(name = "Anatoli")
public class SomeClass {

    @GetProperty("name")
    String myName;

    @AuthorInfo(name = "Anatoli method")
    public void someMethod() {

    }
}
