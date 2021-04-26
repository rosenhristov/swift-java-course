package bg.swift.lectures.loops;

import java.util.Scanner;

/**
 * Created by Anatoli.
 *
 * По дадено число n да отпечатаме на конзолата триъгълник с n на брой реда
 *
 * 1
 * 1 2
 * 1 2 3
 * . . .
 * 1 2 3 . . . n
 */
public class NestedLoopsExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
