package bg.swift.lectures.blocks;

public class BlockExamples {
    public static void main(String[] args) {
        int x;

        x = 10;

        { // Начало на нов блок (област на видимост)
            int y = 25;
            System.out.println("x and y:" + x + " " + y);
            x = x + y;
            // int x = 0;
        }

        System.out.println(" x = " + x);
        // y = 10 ;
        //System.out.println(" y = " + y);

    }
}
