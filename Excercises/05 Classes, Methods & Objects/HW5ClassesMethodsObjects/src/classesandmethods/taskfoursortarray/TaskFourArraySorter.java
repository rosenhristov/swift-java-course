package classesandmethods.taskfoursortarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rossen on 15.2.2016 г..
 */

/*
    Задача 4 (ДОПЪЛНИТЕЛНА):
    Напишете метод, който да сортира едномерен числен масив с N елемента във възходящ ред. Използвайте сортиращ
    алгоритъм по ваш избор (например quick sort, bubble sort, direct sort). Напишете вариантен метод, който приема и
    2ри параметър показващ реда на сортирането: възходящо или низходящо.
*/

public class TaskFourArraySorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the length of the array: ");
        int x = input.nextInt();
        int[] array = new int [x];
        System.out.print("Ascending sort? Write 'true' or 'false': ");
        boolean asc = input.nextBoolean();//ascending or not

        //Initialize array
        initializeArray(x, array);

        //Print sorted array
        int[] sortedArray = sortArray(array);
        System.out.println("Sorted ascending by default:");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Sorted ascending or descending depending on the user:");
        int[] arraySortedAscOrDesc = sortArray(asc, array);
        System.out.println(Arrays.toString(arraySortedAscOrDesc));


    }

    private static int[] initializeArray(int x, int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.printf("Enter element %d: ", i);
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int[] sortArray(int[] array) {//bubble sort
        for(int i=0; i<array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static int[] sortArray(boolean asc, int[] array) {//bubble sort
        for(int i=0; i<array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if (asc == true) {
                    if(array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else {
                    if(array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }

            }
        }
        return array;
    }


}
