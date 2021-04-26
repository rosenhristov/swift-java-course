package bg.swift.lectures;

public class GenericClassExample {

    public static class GenericClass<T> {
        private T field;

        public void put(T t) {
            this.field = t;
        }
        public T get() {
            return field;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> instance = new GenericClass<String>();

        instance.put("Test");
        System.out.println(instance.get());

        GenericClass<Integer> instanceInteger = new GenericClass<Integer>();

        instanceInteger.put(1);
        System.out.println(instanceInteger.get());
    }
}
