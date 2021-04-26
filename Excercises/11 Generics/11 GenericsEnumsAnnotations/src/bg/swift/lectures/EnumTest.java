package bg.swift.lectures;

public class EnumTest {

    public static void main(String[] args){
        Ocenka x = Ocenka.SLAB;
        System.out.println(x.getValue());
        System.out.println(x.value);
        x.print();

        x = Ocenka.OTLICHEN;
        x.print();
    }
}
