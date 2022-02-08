package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 2, 1, 4, 5};
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSwapped = true;
        int k = 1;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSwapped = true;
                }
            }
            System.out.println(k + " Iteration : " + Arrays.toString(arr));
            k++;
        }

    }

    public static void swap(int[] arr, int fromIdx, int toIdx) {
        int temp = arr[fromIdx];
        arr[fromIdx] = arr[toIdx];
        arr[toIdx] = temp;
    }

}
