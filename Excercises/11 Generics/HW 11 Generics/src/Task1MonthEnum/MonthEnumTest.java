package Task1MonthEnum;

import java.util.Scanner;
import Task1MonthEnum.Months;

/**
 * Created by Rossen on 18.3.2016 г..
 */
public class MonthEnumTest {
    public static void main(String[] args) {
        System.out.println("Enter a number in the range [1;12]:");
        Scanner in = new Scanner(System.in);
        int num = 0;
        num = in.nextInt();
        if (num <= 0 || num > 12) {
            while (num <= 0 || num > 12) {
                System.out.println("Enter a number again (range[1;12]):");
                num = in.nextInt();
            }
        }
        switch (num) {
            case 1:
                System.out.println("The month is " + Months.JANUARY);
                break;
            case 2:
                System.out.println("The month is " + Months.FEBRUARY);
                break;
            case 3:
                System.out.println("The month is " + Months.MARCH);
                break;
            case 5:
                System.out.println("The month is " + Months.MAY);
                break;
            case 6:
                System.out.println("The month is " + Months.JUNE);
                break;
            case 7:
                System.out.println("The month is " + Months.JULLY);
                break;
            case 8:
                System.out.println("The month is " + Months.AUGUST);
                break;
            case 9:
                System.out.println("The month is " + Months.SEPTEMBER);
                break;
            case 10:
                System.out.println("The month is " + Months.OCTOBER);
                break;
            case 11:
                System.out.println("The month is " + Months.NOVEMBWER);
                break;
            case 12:
                System.out.println("The month is " + Months.DECEMBER);
                break;
            default:
                System.out.println("No such a month! Enter a value between 1 and 12.");
                break;
        }
    }
}