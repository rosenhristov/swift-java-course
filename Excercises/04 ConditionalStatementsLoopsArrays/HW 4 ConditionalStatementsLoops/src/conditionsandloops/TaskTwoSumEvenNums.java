

package conditionsandloops;
/**
 * Created by Rossen on 7.2.2016 г.
 * Finds the sum of the even numbers in the interval [1; 100].
 */
/*
     Намерете сумата на ЧЕТНИТЕ числа в диапазона от 1 до 100 включително
*/
public class TaskTwoSumEvenNums {

    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while (num <= 100) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.printf("The sum of the even numbers within [0;100] is: %d", sum);
    }
}
