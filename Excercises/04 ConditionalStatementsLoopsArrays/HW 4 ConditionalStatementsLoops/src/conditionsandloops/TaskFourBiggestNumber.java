package conditionsandloops;

import java.util.Scanner;

/**
 * Created by Rossen on 7.2.2016 г.
 *Accepts three numbers entered by the user and prints the biggest of them on the console
 */
/* Напишете програма, която да намира най-голямото от дадени 3 числа. Числата се въвеждат през конзолата.
(използвайте if-else оператора).
*/
public class TaskFourBiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        System.out.print("Enter number 1: ");
        double num1 = Double.parseDouble(input.nextLine());
        System.out.print("Enter number 2: ");
        double num2 = Double.parseDouble(input.nextLine());
        System.out.print("Enter Number 3: ");
        double num3 = Double.parseDouble(input.nextLine());
        double biggestNumber = 0.0;

        if ((num1 > num2) && (num2 > num3)){
            biggestNumber = num1;
            System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
        }
        else if ((num1 < num2) && (num2 < num3)) {
            biggestNumber = num3;
            System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
        }
        else if ((num1 > num2) && (num2 < num3)){
            if (num1 > num3){
                biggestNumber = num1;
                System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
            } else {
                biggestNumber = num3;
                System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
            }
        } else if ((num1 < num2) && (num2 > num3)) {
            biggestNumber = num2;
            System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
        } else if ((num1 < num2) && (num2 == num3)) {
            biggestNumber = num2;
            System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
        } else if ((num1 > num2) && (num2 == num3)) {
            biggestNumber = num1;
            System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
        } else if ((num1 == num2) && (num2 > num3)){//num1 == num2
            biggestNumber = num2;
            System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
        } else if ((num1 == num2) && (num2 < num3)) {
            biggestNumber = num3;
            System.out.printf("The biggest among %s, %s and %s is %s", num1, num2, num3, biggestNumber);
        } else {//num1 == num2 && num2 == num3
            System.out.printf("The three numbers are equal");
        }

    }
}
