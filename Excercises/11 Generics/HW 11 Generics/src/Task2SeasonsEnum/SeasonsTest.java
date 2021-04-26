package Task2SeasonsEnum;

import Task2SeasonsEnum.Seasons;
import java.util.Scanner;

/**
 * Created by Rossen on 24.3.2016 г..
 */
public class SeasonsTest {
    public static void main(String... args) {
        System.out.println("Enter a number in the range [1;4]:");
        Scanner in = new Scanner(System.in);
        int num = 0;
            num = in.nextInt();
        if (num <= 0 || num > 4) {
            while (num <= 0 || num > 4) {
                System.out.println("Enter a number again (range[1;4]):");
                num = in.nextInt();
            }
        }
        switch (num) {
            case 1:
                System.out.println("The season is " + Seasons.SPRING);
                break;
            case 2:
                System.out.println("The season is " + Seasons.SUMMER);
                break;
            case 3:
                System.out.println("The season is " + Seasons.AUTUMN);
                break;
            case 4:
                System.out.println("The season is " + Seasons.WINTER);
                break;
        }
    }
}
