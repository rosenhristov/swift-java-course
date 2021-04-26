package bg.swift.lectures.classes.inner;


public class AnonymousClassExample2 {
    static class AbstractObject{
         void test() {
             System.out.println("AbstractObject.test");
         };
    }

    public static void callMethodTest(AbstractObject o) {
        o.test();
    }

    public static void main(String[] args) {

        AbstractObject annClass = new AbstractObject() {

            AbstractObject test2() {
                System.out.println("test2");

                AbstractObject abstractObject = new AbstractObject() {
                    void test() {
                        System.out.println("inner test2 test");
                    }
                };

                return abstractObject;
            }

        }.test2();

        annClass.test();

        //AnonymousClassExample2.callMethodTest(annClass);
//        AnonymousClassExample2.callMethodTest(annClass);
//
//        AnonymousClassExample2.callMethodTest(new AbstractObject() {
//            void test() {
//                System.out.println("2");
//            }
//        });

    }
}
