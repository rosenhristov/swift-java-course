
package conditionsandloops;

/**
 * Created by Rossen on 6.2.2016 г..
 * The aim of the task is to count the volume of waste a worker is carrying away with a wheelbarrow with volume 450 kg
 * as well as the remaining waste that has to be  carried out by the worker. The total volume of the waste is 7980 tons.
 *
 */

/*
    Имате един работник, който с помоща на товарна количка изхвърля боклук с големина 450 кг.
    Имате общ размер на боклука 7890 тона. Напишете програма,
    която изписва на екрана колко боклук е останал неизхвърлен
    и колко боклук е успял да прехвърли до този момент работника.
    Работникът трябва да изхвърли целия боклук. Използвайте цикъл.
*/

public class TaskOneWasteCount {
    public static void main(String[] args) {
        int wheelbarrowVolume = 450; //volume of the wheelbarrow used by the worker to carry the waste away, kg

        long totalWaste = 7890000; //the total amount of waste, kilograms
        int loopsNumber = (int)totalWaste/wheelbarrowVolume;
        int thrownWaste = 0;
        long remainingWaste = 0;

        System.out.println("Thrown Waste\t\tRemaining waste");
        //calculates and prints the quantity of waste thrown by the worker and the remaining quantity in kilograms
        for (int i = 1; i <= loopsNumber; i++) {
            thrownWaste += wheelbarrowVolume;
            remainingWaste = totalWaste - thrownWaste;

            if (remainingWaste < 0) {//in case remaing waszte is less than the volume of a full wheelbarrow
                remainingWaste += wheelbarrowVolume;
                thrownWaste += totalWaste - (int)remainingWaste;
                System.out.printf("%d\t\t\t\t\t%d\n", thrownWaste, remainingWaste);
            }

            System.out.printf("%d\t\t\t\t\t%d\n", thrownWaste, remainingWaste);

        }
        thrownWaste += remainingWaste;
        remainingWaste -= remainingWaste;
        System.out.printf("%d\t\t\t\t\t%d\n", thrownWaste, remainingWaste);
    }
}
