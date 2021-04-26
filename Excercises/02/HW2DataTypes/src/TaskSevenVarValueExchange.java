/**
 * Created by Rossen on 31.1.2016 г.
 * Exchange of the values of two integer variables. Solved in several ways
 */
/*
7) Декларирайте две променливи от тип int. Задайте им стойности съответно 5 и 10.
Разменете стойностите им и ги отпечатайте.
*/
public class TaskSevenVarValueExchange {
    public static void main(String[] args) {
        System.out.println("The initial values of the numbers are: ");
        int num1 = 5;
        int num2 = 10;
        System.out.println("Number1 = " + num1);
        System.out.println("Number2 = " + num2);

        System.out.println("Solution 1: Exchange by addition and subtraction: ");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Now Number1 is " + num1 + " and Number2 is " + num2);

        System.out.println("Solution 2: Use of temporary variable: ");
        int temp = num1; //temp = 5, num1 = 5, num2 = 10
        num1 = num2; //num1 = 10, num2 = 10, temp = 5
        num2 = temp; //num2 = 5; num2 = 5, temp = 5
        System.out.println("Now Number1 is " + num1 + " and Number2 is " + num2);

        System.out.println("Solution 3: Bitwise exchange: ");
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Now Number1 is " + num1 + " and Number2 is " + num2);
    }
}
