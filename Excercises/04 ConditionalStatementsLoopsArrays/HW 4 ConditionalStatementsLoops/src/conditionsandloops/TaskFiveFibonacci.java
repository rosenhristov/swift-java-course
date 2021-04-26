package conditionsandloops;

import java.util.Scanner;

/**
 * Created by Rossen on 7.2.2016 г.
 * Find the members of the fibonacci order up to n
 */
/* 5) Намерете редицата на Фибоначи за N (0, 1, 1, 2,3,5,8……).
Бележки: всеки следващ член се образува от сумата на предходните два. Първите два члена са 0 и 1;
*/
public class TaskFiveFibonacci {
    public static void main(String[] args) {
        System.out.println("Please, enter the number of members 'n' you wish to calculate:");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());//n is the number of members
        int num1 = 0;//first member
        int num2 = 1;//second member
        //Print the first two members
        System.out.println(num1);
        System.out.println(num2);

        //In case 'n' is even, we loop (n-2)/2 times to print n-2 other members, i.e. 'n' members totally
        for (int i = 1; i <= (n-2)/2; i++){//prints 2 members per loop from 3rd to n-th.
            num1 = num1 + num2;
            num2 = num2 + num1;
            System.out.println(num1);
            System.out.println(num2);
        }
        //The loop above works well if n is even only e.g. n = 10 -> (10-2)/2 = 4
        //If 'n' is odd, e.g. 11-> (11-2)/2 = 4 (integer) again
        //thus the number of members printed will be 10 again, instead of 11
        //Consequently, if 'n' is odd(n % 2 != 0) we need to print one more member
        if (n % 2 != 0) {
            num1 = num1 + num2;
            System.out.println(num1);
        }
    }
}
