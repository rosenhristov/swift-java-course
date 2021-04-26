package bg.swift.lectures.loops;

import java.util.Scanner;

/**
 * Created by Anatoli.
 */
public class BreakAndContinueExample {

    public static void main(String[] args) {

        // Сумата на всички нечетни естествени числа в интервала [1...n], който не се делят на 7
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            if (i % 7 == 0) {
                continue;
            }
            sum += i;
        }

        System.out.println("sum = " + sum);

        // брой числа от [startValue...1000] неделящи се на 3
        int startValue = input.nextInt();
        int NotDividableByThreeCount = 0;
        for (int i = startValue; i < 1000; i++) {
            if (i % 3 == 0)
                continue;
            NotDividableByThreeCount++;
        }
        System.out.println("NotDividableByThreeCount: " + NotDividableByThreeCount);

        // Todo for break
    }
}
