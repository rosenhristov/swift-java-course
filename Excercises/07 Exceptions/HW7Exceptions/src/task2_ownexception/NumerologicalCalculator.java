package task2_ownexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Rossen on 13.3.2016 г..
 */
/*
    Задача 2:
    Създайте ваше си проверено изключение. Създайте клас с метод, който хвърля това изключение.
    Използвайте този клас, за да хвърлите изключението, хванете го и изпишете на екрана StackTrace.
*/
public class NumerologicalCalculator {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int day = 0, month = 0, year = 0, numerologicalValue = 0, remainder = 0;
        java.lang.String str = null;
        try {
            do {
                System.out.println("Enter the number of the day [1;31] of your birth:");
                day = sc.nextInt();
            } while (day <= 0 || day > 31);
            do {
                System.out.println("Enter your birth month [1;12]:");
                month = sc.nextInt();
            } while (month <= 0 || month > 12);
            System.out.println("Enter your birth year[YYYY]:");
            year = sc.nextInt();
            if (year / 100 == 0) {
                throw new InvalidYearInputFormatException();
            }
            remainder = day + month + year;
            System.out.println("Numerological value: " +
                    computeNumerologicalValue(numerologicalValue, remainder));
        } catch (InvalidYearInputFormatException e) {
            System.out.println("Year format exception!\n" +
                    "Please enter your birth year as a 4-digit number: e.g. '1990', not '90'.\n" +
                    "Otherwise correct output is impossible.\n" +
                    "In case you need more detailed info, you can check Strack trace:");
            e.printStackTrace();
        } catch (InputMismatchException ime) {
            System.out.println("Input mismatch. Please, enter a number.");
        }
    }

    private static int computeNumerologicalValue(int numerologicalValue, int remainder) {
        for (int i = 1; i <= 4; i++) {
            numerologicalValue += remainder % 10;
            remainder /= 10;
        }
        while (numerologicalValue / 10 > 0) {//if numerological value is not a 1-digital number yet
            remainder = numerologicalValue;//repeat the operation until you receive a number with 1 digit only
            numerologicalValue = 0;
            for (int i = 1; i <= 2; i++) {
                numerologicalValue += remainder % 10;
                remainder /= 10;
            }

        }
        return numerologicalValue;
    }
}