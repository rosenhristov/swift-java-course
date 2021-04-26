/**
 * Created by Rossen on 31.1.2016 г.. Manipulations with Strings concatenation and Object variable.
 */

/*
Task 6
- Declare two String variables with values "Hello" and "World". Declare an Object variable.
-Initialize the latter using the concatenated values of the two String variables. Add interval if necrssary.
- Print the Object variable.
- Declare a third String variable and initialize it with the value of the Object variable.
*/






public class TaskSixStringAndObject {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        Object obj;
        obj = (Object)hello + " " + (Object)world;
        System.out.println("Object value: " + obj);
        String totalString = (String)obj;
        System.out.println("String value: " + totalString);
    }
}
