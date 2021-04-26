import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Rossen on 31.1.2016 г.
 * Declaration and initialization of variables with suitable types, describing different entities.
 */

/*4) Декларирайте променливи с най-подходящия за тях тип и им задайте стойност, които да описват :
- име на човек
- години
- пол - дали е мъж или жена
- сума в банковата сметка
- първата буква от името на човека
- цвят на очите
*/
public class TaskFourSuitableVars {
    public static void main(String[] args) {
        String fullName= "Rossen Hristov";
        int age = 34;
        boolean isMale = true;
        double bankAmount = 10000.00;
        char firstLetter = 'R';
        String eyesColour = "brown";

        //Printing the variables on the console
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Mail Gender: " + isMale);
        System.out.println("Bank Ammount: " + bankAmount);
        System.out.println("The first Letter of the name: " + firstLetter);
        System.out.println("Colour of eyes: " + eyesColour);
    }
}
