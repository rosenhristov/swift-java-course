package bg.swift.lectures.enums;

public class EnumTest {
    public static void main(String[] args){
        Grade g = OcenkaBG.DOBAR;
        g.print();

        g = OcenkaUS.F;
        g.print();

        g = new GradeClass();
    }
}
