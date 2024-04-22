package UQU;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort<T extends Comparable<T>> {

    public void selectionSort(T[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort<Integer> selectionSort = new SelectionSort<>();

        int N = 10;
        Integer[] arr = new Integer[N];
        Random rm = new Random();
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        selectionSort.selectionSort(arr);

        System.out.println("\n\nSorted array: ");
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}

