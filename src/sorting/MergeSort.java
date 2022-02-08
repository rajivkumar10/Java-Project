package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {82, 44, 12, 85, 36, 98, 62, 6};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        //create temp array
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;
        //Traverse array and store smaller in temp array
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        //Add remaining elements
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        //Add remaining elements
        while (j <= end) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
    }
}
