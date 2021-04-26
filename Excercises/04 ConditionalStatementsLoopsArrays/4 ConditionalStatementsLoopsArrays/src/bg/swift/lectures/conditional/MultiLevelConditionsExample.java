package bg.swift.lectures.conditional;

import java.util.Scanner;

/**
 * Created by Anatoli.
 */
public class MultiLevelConditionsExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");

        int first = input.nextInt();
        int second = input.nextInt();

        if (first == second) {
            System.out.println("These two numbers are equal.");
        } else {
            if (first > second) {
                System.out.println("The first number is greater.");
            } else {
                System.out.println("The second number is greater.");
            }
        }
    }
}
