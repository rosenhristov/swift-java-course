package bg.swift.lectures.debugging;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array == null || array.length == 0 || low >= high) {
            return;
        }

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // make left < pivot and right > pivot
        int i = low;
        int j = high;
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swapNumbers(array, i, j);
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

    private static void swapNumbers(int numbers[], int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String argv[]) {
        //int array[] = {4, 12, 9, 14, 3, 10, 17, 11, 8, 7, 4, 1, 6, 19, 5, 21, 2, 3};

        //  minimized failure-induced input
          int array[] = {3, 5, 2, 3};

        quickSort(array, 0, array.length - 1);

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
