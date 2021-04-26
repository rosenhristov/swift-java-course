package bg.swift.lectures.datastructures;

/**
 * Created by Anatoli.
 */
public class ComplexityDemo {

    // O(N)
    int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // O(N^2)
    int findInversions(int[] array) {
        int inversions = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    inversions++;
                }
            }
        }
        return inversions;
    }

    // O(N*М)
    long sumMN(int n, int m) {
        long sum = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                sum += x * y;
            }
        }
        return sum;
    }

    // понеже на всяка стъпка от изпълнението на функцията се извършват средно по 2 рекурсивни извиквания,
    // то броят рекурсивни извиквания би трябвало да е от порядъка на 2^n, т.е. имаме експоненциална сложност
    long fibonacci(int n) {

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
