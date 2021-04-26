package lecturefourarrays;

import java.util.Scanner;

/**
 * Created by Rossen on 13.2.2016 г..
 * The programm declares a matrix with dimensions input by the user. Then it initializes the matrix with values also
 * chosen by the user. Finally, it prints the matrix on the console and indicates what is the value of the
 * biggest element.
 */
/*
    5. Напишете програма, която намира средно аритметичното на даден двумерен масив (NxM) и намира стойността на
    максималният елемент.
*/
public class TaskFiveMatrixBiggestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, choose the number of rows: ");
        int rowNum = input.nextInt();//number of rows

        System.out.print("Please, choose the number of columns: ");
        int colNum = input.nextInt();//number of columns

        int[][] matrix = new int[rowNum][colNum];//declaration of the matrix
        int maxElement = 0;//this variable stores the value of the biggest element

        //Initialization of the matrix elements
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.printf("Element No [%d][%d] is: ",
                        (i+1), (j+1));//i+1: computers start counting from 0 but users usually not
                matrix[i][j] = input.nextInt();
            }

        }

        //find the element with the biggest value
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        System.out.println("The biggest element in the following 2D NxM array:");
        //Prtint the array
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.printf("%d ", matrix[i][j]);//i+1: computers start counting from 0 but users usually not
            }
            System.out.println();
        }

        //Print the biggest element
        System.out.printf(" ...is: %d\n", maxElement);
    }
}
