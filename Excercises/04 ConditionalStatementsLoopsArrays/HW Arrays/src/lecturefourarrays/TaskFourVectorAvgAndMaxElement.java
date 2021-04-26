package lecturefourarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rossen on 10.2.2016 г..
 * The programmme  creates a 1D array called 'vector' that gets initialized by accepting values from the console
 * inputed by the user. Then it finds the sum of the elements and the biggest element within a foreach loop. Finally, it
 * prints three strings: the array, the average value of all the elements (calculated directly before printing) and
 * the biggest element.
 */
/*
    4. Напишете програма, която намира средно аритметичното на даден едномерен масив с N елемента и намира стойността
    на максималният елемент.
*/

public class TaskFourVectorAvgAndMaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, choose the length of the vector!: ");
        int len = input.nextInt();
        int[] vector = new int[len];
        int maxElement = 0;
        int sum = 0;

        //Initialization of the vector
        for (int i = 0; i < len; i++) {
            System.out.printf("Element No [%d] is: ", i+1);// i+1: computers start counting from 0 but users usually not
            vector[i] = input.nextInt();
        }

        //find the sum and the biggest element
        for (int element : vector) {
            sum += element;
            if (element > maxElement) {
                maxElement = element;
            }
        }
        //Prtint the array
        System.out.printf("The vector is: %s\n", Arrays.toString(vector));
        //Print average
        System.out.printf("The average of the vector's elements 'vector[i]' is: %d\n", sum/len);
        //Print the biggest element
        System.out.printf("The biggest element is: %d\n", maxElement);
    }
}
