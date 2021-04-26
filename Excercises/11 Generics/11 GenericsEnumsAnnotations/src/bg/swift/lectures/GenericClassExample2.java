package bg.swift.lectures;

public class GenericClassExample2 {

    public static void main(String[] args) {
        GenericClass<String, Integer> o = new GenericClass<>();
        o.put("Test", 3);
        System.out.println(o.get("Test"));

        GenericClass<String, String> s = new GenericClass<>();
        s.put("Test", "dsadsadas");
        System.out.println(s.get("Test"));
    }
}
