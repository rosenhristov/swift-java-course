package lecturefourarrays;



import java.util.Scanner;

/**
 * Created by Rossen on 10.2.2016 г..
 */
/*
    3. Напишете програма, която въвежда NxN двумерен масив от конзолата (първо пита за N, след това въвежа елементите
    един по един на дадените индекси). Намерете двата диагонала, като изпишете елементите им на екрана. След това
    изпишете центъра (пресечната точка на двата диагонала) и изпишете и него.
*/
public class TaskThreeRectangularMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please define the number of rows: ");
        int row = input.nextInt();//numberof the rows in the NxM matrix
        System.out.print("Please, define the number of columns: ");
        int col = input.nextInt();//mu,ber ofthe columns in the NxM matrix
        int[][] matrix = new int[row][col];

        //matrix initialization
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Please, enter a value for matrix[%d][%d]: ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

        //Print the whole matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

        //Print diagonals
        System.out.print("Diagonal 1 is: ");
        for (int i = 0; i < row; i++) {//first diagonal

            System.out.printf("%d ", matrix[i][i]);
        }
        System.out.println();//new line
        System.out.print("Diagonal 2 is: ");

        int r = row - 1;//current row number in the second diagonal
        int c = 0;//current column number in the second diagonal

        // prints second diagonal
        for (int i = 0; i < row; i++) {
            System.out.printf("%d ", matrix[r][c]);
            r--;
            c++;
        }
        System.out.println();

        //Print center
        System.out.printf("The center of the matrix is: matrix [%d][%d]: %d.",
                matrix.length/2, matrix[0].length/2, matrix[matrix.length/2][matrix[0].length/2] );

    }
}
