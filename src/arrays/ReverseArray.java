package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {100, 200, 300, 400, 500, 560};
        System.out.println(Arrays.toString(reverseArray(a)));
    }

    public static int[] reverseArray(int[] arr) {
        int size = arr.length - 1;
        for (int i = 0; i < size; i++) {
            swap(arr, i, size--);
        }
        return arr;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
