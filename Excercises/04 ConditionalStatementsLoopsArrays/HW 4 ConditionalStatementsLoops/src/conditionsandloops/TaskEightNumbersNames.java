package conditionsandloops;

import java.util.Scanner;

/**
 * Created by Rossen on 7.2.2016 г..
 */
public class TaskEightNumbersNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 999: ");
        int number = Integer.parseInt(input.nextLine());

        int units = number % 10;
        int decimals = (number / 10) % 10;
        int hundreds = number / 100;

        switch (hundreds) {
            case 0:
                ;
                break;
            case 1:
                System.out.print("сто");
                break;
            case 2:
                System.out.print("двеста");
                break;
            case 3:
                System.out.print("триста");
                break;
            case 4:
                System.out.print("четиристотин");
                break;
            case 5:
                System.out.print("петстотин");
                break;
            case 6:
                System.out.print("шестотин");
                break;
            case 7:
                System.out.print("седемстотин");
                break;
            case 8:
                System.out.print("осемстотин");
                break;
            case 9:
                System.out.print("деветстотин");
                break;
        }

        if (decimals == 0) {
            if (units == 0) {
                System.out.print(" ");
            }
        } else {//decimals!=0
            if (decimals == 1) {
                System.out.print(" и ");
            } else {
                if (units == 0) {
                    System.out.print(" и ");
                } else {
                    System.out.print(" и ");
                }
            }
        }

        switch (decimals) {
            case 0:
                System.out.print(" ");
                break;
            case 1:
                switch (units) {
                    case 0:
                        System.out.print("десет");
                        break;
                    case 1:
                        System.out.print("единадесет");
                        break;
                    case 2:
                        System.out.print("дванадесет");
                        break;
                    case 3:
                        System.out.print("тринадесет");
                        break;
                    case 4:
                        System.out.print("четиринадесет");
                        break;
                    case 5:
                        System.out.print("петнадесет");
                        break;
                    case 6:
                        System.out.print("шестнадесет");
                        break;
                    case 7:
                        System.out.print("седемнадесет");
                        break;
                    case 8:
                        System.out.print("осемнадесет");
                        break;
                    case 9:
                        System.out.print("деветнадесет");
                        break;
                }
                break;
            case 2:
                System.out.print("двадесет ");
                break;
            case 3:
                System.out.print("тридесет ");
                break;
            case 4:
                System.out.print("четиридесет ");
                break;
            case 5:
                System.out.print("петдесет ");
                break;
            case 6:
                System.out.print("шестдесет ");
                break;
            case 7:
                System.out.print("седемдесет ");
                break;
            case 8:
                System.out.print("осемдесет ");
                break;
            case 9:
                System.out.print("деветдесет ");
                break;
        }

        if (decimals != 1) {
            if (units != 0)
                System.out.print(" и ");

            switch (units) {
                case 0:
                    System.out.print(" ");
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
            }
        }
        System.out.println(" ");
    }
}
