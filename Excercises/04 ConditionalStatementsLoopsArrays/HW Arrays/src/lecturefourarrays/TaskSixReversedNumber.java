package lecturefourarrays;

import java.util.Scanner;

/**
 * Created by Rossen on 13.2.2016 г..
 * The programme accepts a decimal number from the console and reverses it by cutting its digits one by one and saving
 * them in a vector array. Then it prints the elements of vectorlook and the result is a reversed number. In case the
 * input is a number ending with zero(es) the program can output the reversed number without the starting zeroes too.
 */

/*
    6. Напишете програма, която отпечатва цифрите на дадено десетично число в обратен ред. Например 256, трябва да бъде
    отпечатано като 652.
*/
public class TaskSixReversedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please, enter the number you'd like to reverse: ");
        int num = input.nextInt();//the number the programme will work with
        int remainder = num;//how many digits remain to be processed
        int length = 0;//the number of digits in the given number 'num'

        //The task does not say how long the numbers the program should process should be. Consequently, it cannot
        // expect the digits will be e.g. 2 or 3 only. The program uses a vector to store the digits, thus it should
        // know how long the vector should be. Therefore, it should check the digits' number to declare the length of
        // the vector.

        do {//the number should have at least one digit, thus the program needs at least one loop
            ++length;
            remainder /= 10;
            } while(remainder > 0);

        int[] digits = new int[length];//declaration of the vector tha will store the digits
        remainder = num;//full number of digits to be processed

        //Put the digits of the number in the array
        for (int i = 0; i < length; i++) {
            digits[i] = remainder % 10;
            remainder /= 10;
        }

        //Print the reversed number, i.e. the elements of the vector in order
        System.out.print("The reversed number is: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();

        //The output above is fine but it has a disadvantage. If the user enters a number ending with zeroes(e.g. 1900),
        //the output will start with zeroes(in that case 0091). Since the programme works with decimal numbers, the
        //zeroes at the begining are practically useless. So, it could be a good idea to eliminate the zeroes at the
        //beginning. In that case a fine output could be:
        if (digits[0] == 0) {
            System.out.print("The reversed number with starting zeroes eliminated is: ");

            int start = 0;//the reversed number may have more than 1 starting zero as in the example above(0091)
            for (int i = 0; i < length; i++) {//finds the first index with nonzero value
                start = i;
                if (digits[i] != 0) {
                    break;
                }
            }
            //Prints the vector but starting from the smallest index with nonzero value
            for (int i = start; i < length; i++) {
                System.out.print(digits[i]);
            }
        }
    }
}