package taskonearraycheck;

import java.util.Scanner;

/**
 * Created by Rossen on 14.2.2016 г..
 */

/*
    Задача 1:
    Напишете метод, който да приема 2 параметъра : единият е едномерен масив от цели числа, а другият параметър е цяло
    число. Нека се провери дали едномерният масив съдържа в някой от елементите си стойността, която е зададена във
    втория параметър; Ако масива съдържа числото, нека се върне true като резултат, в противен случай да се върне false.
    Напишете програма, която тества този метод с различни входни данни.
*/

public class TaskOneArrayCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] vector = new int [5];
        int number;

        //Initialization of the array
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Insert value fot array[%d]: ", i);
            vector[i] = input.nextInt();
        }
        System.out.print("Enter value for the number: ");
        number = input.nextInt();

        System.out.printf("Is the number in the vector?\n%b", findNumber(vector, number));
    }

    private static boolean findNumber(int[] vector, int number){
        boolean exist = false;
        for (int i = 0; i < vector.length; i++) {
            if (number == vector[i]){
                exist = true;
            }
        }
        return exist;
    }
}
