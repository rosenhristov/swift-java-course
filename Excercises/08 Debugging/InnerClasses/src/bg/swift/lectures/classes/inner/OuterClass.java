package bg.swift.lectures.classes.inner;

/**
 *  Външният клас OuterClass дефинира в себе си като private член класа InnerClass.
 *  Нестатичните методи на вътрешния клас имат достъп както до собствената си инстанция this,
 *  така и до инстанцията на външния клас (чрез синтаксиса OuterClass.this).
 *  При създаването на вътрешния клас на конструктора му се подава this референцията на външния клас,
 *  защото вътрешният клас не може да съществува без конкретна инстанция на външния.
 *
 *  Външния клас може да вика свободно private методи и конструктори от вътрешния клас
 *
 *  Вътрешните класове могат да бъдат декларирани като статични (чрез модификатора static).
 *  В този случай те могат да съществуват и без външния клас, в който са разположени,
 *  но нямат достъп до неговата this инстанция.
 */
public class OuterClass {

    private String name;

    private OuterClass(String name) {
        this.name = name;
    }


    private class InnerClass {

        private String name;

        private InnerClass(String name) {
            this.name = name;
        }

        private void printNames() {
            System.out.println("Inner name: " + this.name);
            System.out.println("Outer name: " + OuterClass.this.name);
        }
    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass("outer");
        InnerClass innerClass = outerClass.new InnerClass("inner");
        innerClass.printNames();
    }
}
