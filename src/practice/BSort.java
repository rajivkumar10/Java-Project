package practice;

import java.util.Arrays;

public class BSort {

    public static void sort(int[] arr) {
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i+1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
    public static void swap(int[] arr,int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        sort(arr);
        System.out.printf(Arrays.toString(arr));
    }
}
