package conditionsandloops;

import java.util.Scanner;

/**
 * Created by Rossen on 7.2.2016 г..
 * Accepts a number from the Console and in case it is within [1;12] it prints the name of the concrate month.
 * In case the numbewr is > 12 or < 1 i asks the use to input a correect number saying:
 * "Please, enter correct month number"
 */

/* 3) Напишете програма, която да принтира имената на месеците от годината.
   Потребителят въвежда число и ако то отговаря на месец от годината, се показва името на месеца.
   Пример : Въвеждам числото 3 през конзолата и тя ще изведе месеца, отговарящ на числото - в случая “March".
   Ако няма такъв месец, се принтира съобщение "Please, enter correct month number“
*/

public class TaskThreeMonthsNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Please enter an integer within the interval [1;12]: ");
            num = input.nextInt();
            if((num > 12) || (num < 1)) {
                System.out.println("Please, enter correct number");
            }
        } while ((num > 12) || (num < 1));

        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("Jully");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
            System.out.println("Incorrect number!");
            break;
        }
    }
}
