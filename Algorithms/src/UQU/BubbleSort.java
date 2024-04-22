package UQU;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort<T extends Comparable<T>> {

    public void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        int N = 10;
        Integer[] arr = new Integer[N];
        Random rm = new Random();
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        bubbleSort.bubbleSort(arr);

        System.out.println("\n\nSorted array: ");
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
