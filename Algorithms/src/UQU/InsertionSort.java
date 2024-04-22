package UQU;

import java.util.Random;

public class InsertionSort {

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int N = 10;
        int[] arr = new int[N];
        Random rm = new Random();
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        insertionSort.insertionSort(arr);

        System.out.println("\n\nSorted array: ");
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }
}
