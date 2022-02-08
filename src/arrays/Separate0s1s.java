package arrays;

import java.util.Arrays;

public class Separate0s1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0 , 1 , 0, 1};
        separate0s1s(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void separate0s1s(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr.length - 1;
            while (arr[left] == 0) {
                left++;
            }
            while (arr[right] == 1) {
                right--;
            }
            if (left < right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }

    }
}
