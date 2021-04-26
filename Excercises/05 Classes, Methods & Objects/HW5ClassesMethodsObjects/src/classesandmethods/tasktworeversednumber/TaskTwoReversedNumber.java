package tasktworeversednumber;


import java.util.Scanner;

/**
 * Created by Rossen on 14.2.2016 г..
 */

/*
    Задача 2:
    Напишете метод, който отпечатва цифрите на дадено десетично число в обратен ред.
    Например 512, трябва да бъде отпечатано като 215
*/

public class TaskTwoReversedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the number you'd like to reverse: ");
        int num = input.nextInt();//the number the programme will work with
        int remainder = num;//how many digits remain to be processed


        //The task does not say how long the numbers the program should process should be. Consequently, it cannot
        // expect the digits will be e.g. 2 or 3 only. The program uses a vector to store the digits, thus it should
        // know how long the vector should be. Therefore, it should check the digits' number to declare the length of
        // the vector.

        //the number of digits in the given number 'num'
        int length = countDigits(remainder);//method counting the digits in order to know how to initailize the array

        int[] digits = new int[length];//declaration of the vector tha will store the digits
        remainder = num;//full number of digits to be processed

        //Put the digits of the number in the array (array initialization)
        cutNumberToDigits(digits, remainder);

        //Print the reversed number, i.e. the elements of the vector in order
        System.out.print("The reversed number is: ");
        printReversedNumber(digits);

        //The output above is fine but it has a disadvantage. If the user enters a number ending with zeroes(e.g. 1900),
        //the output will start with zeroes(in that case 0091). Since the programme works with decimal numbers, the
        //zeroes at the begining are practically useless. So, it could be a good idea to eliminate the zeroes at the
        //beginning. In that case a fine output could be:
        if (digits[0] == 0) {
            System.out.print("The reversed number with starting zeroes eliminated is: ");
            //the reversed number may have more than 1 starting zero as in the example above(0091)
            int start = findTheFirstPositiveElement(digits);
            //Prints the vector but starting from the first index with nonzero value
            printReversedNumber(start, digits);
        }
    }

    public static int countDigits(int remainder) {
        int digitsNumber = 0;
        do {//the number should have at least one digit, thus the program needs at least one loop
            ++digitsNumber;
            remainder /= 10;
        } while(remainder > 0);
        return digitsNumber;
    }

    public static void cutNumberToDigits(int[] digits, int remainder) {
        for (int i = 0; i < digits.length; i++) {
            digits[i] = remainder % 10;
            remainder /= 10;
        }
    }

    public static int[] printReversedNumber(int[] digits) {
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
        return digits;
    }

    public static int[] printReversedNumber(int start, int[] digits) {
        for (int i = start; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        return digits;
    }

    public static int findTheFirstPositiveElement(int[] digits) {
        int start = 0;
        for (int i = 0; i < digits.length; i++) {//finds the first index with nonzero value
            start = i;
            if (digits[i] != 0) {
                break;
            }
        }
        return start;
    }

}
