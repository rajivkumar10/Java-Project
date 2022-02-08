package sorting;

import java.util.Arrays;

public class QuickSort {

    private int[] numbers;
    private int len;


    public static void main(String[] args) {
        int[] arr = {38, 22, 55, 98, 41, 34, 12, 5};
        QuickSort qs = new QuickSort();
        qs.sort(arr);
    }

    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        this.numbers = arr;
        this.len = arr.length;
        System.out.println("Array after sorting :" + Arrays.toString(quickSort(0, len - 1)));
    }

    private int[] quickSort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high - low) / 2];
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
        return numbers;
    }

    private void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
