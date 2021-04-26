package task1floatingpointnumberexception;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Created by Rossen on 6.3.2016 г..
 */

/*
    Задача 1: Напишете програма, която очаква от потребителя да въведе число с плаваща запетая.
    Ако въведе грешни данни (например буква), да му съобщи, че е въвел грешен символ, и възможност
    да въведе стойност отново. Ако отново въведе грешни данни, правилото се повтаря (извежда се съобщение за грешка
    и очаква отново да въведе нови данни), докато потребителя не въведе правилни данни. Разгледайте методите на класа
    Scanner (в API документацията на Oracle) . Използвайте, че методите за четене – например: nextFloat() хвърлят
    определени изключения в определени ситуации.

*/
public class FloatNumberProgram {
    /**
     * @param num the number that will be printed on the console. It's accepted as an user input;
     * @param reloop a variable used to define if the loop will continue or break;
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int reloop = 0;
        System.out.println("Enter a number: ");
        try {
            while (!scan.hasNextFloat()) {
                throw new InputMismatchException();
            }
            float num = scan.nextFloat();
            System.out.println("The number is: " + num);
        } catch (InputMismatchException ime) {
            reloop = 1;
            while (reloop != 0) {
                System.out.println("Wrong input! Please, enter a number");
                try {
                    scan.nextLine();
                    float num = scan.nextFloat();
                    System.out.println("Thank you! The number is: " + num);
                    reloop = 0;
                } catch (InputMismatchException ime2) {
                    System.out.println("Wrong input! Enter a number!");
                }
            }

        }
    }
}
