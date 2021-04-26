package conditionsandloops;

import java.util.Scanner;

/**
 * Created by Rossen on 7.2.2016 г.
 * Prints the name of a digit in Bu;garian. The digit is written in the console by the user
 */
/* 6) Напишете програма, която за дадена цифра (0-9), зададена като вход, извежда името на цифрата на български език.
*/
public class TaskSixDigitNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert digit: ");
        int digit = Integer.parseInt(input.nextLine());

        switch (digit)
        {
            case 0:
                System.out.print("нула");
                break;
            case 1:
                System.out.print("едно");
                break;
            case 2:
                System.out.print("две");
                break;
            case 3:
                System.out.print("три");
                break;
            case 4:
                System.out.print("четири");
                break;
            case 5:
                System.out.print("пет");
                break;
            case 6:
                System.out.print("шест");
                break;
            case 7:
                System.out.print("седем");
                break;
            case 8:
                System.out.print("осем");
                break;
            case 9:
                System.out.print("девет");
                break;
            default:
                System.out.print("Не е в интервала [0;9]");
                break;
        }
    }
}
