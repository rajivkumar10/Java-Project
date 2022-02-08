package datastructures.sort;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int loc = partition(arr, left, right);
            quickSort(arr, left, loc - 1);
            quickSort(arr, loc+1, right);
        }
    }


    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int start = left;
        int end = right;
        while (start < end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, left, end);
        return end;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
