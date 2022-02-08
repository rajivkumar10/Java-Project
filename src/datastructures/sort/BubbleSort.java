package datastructures.sort;

import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr) {
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }


    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {6, 7, 3, 2, 1, 4, 5};
        bubbleSort.sort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
}
