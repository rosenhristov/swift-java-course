/**
 * Created by Rossen on 31.1.2016 г..
 * Task to define certain numbers in a proper way.
 */

/*
Declare and initialize the most suitable types for the following variables:
-180
5
9834289023490
7.7
9.802349004
1999
123456789123456789

*/
public class TaskFiveSuitableTypes {
    public static void main(String[] args) {
        short num1 = -180;
        byte num2 = 5;
        double num3 = 9.834289023490E11;
        float num4 = 7.7f;
        double num5 = 9.802349004;
        int num6 = 1999;
        double num7 = 1.23456789123456789E17;

        //Printing values to the console
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}