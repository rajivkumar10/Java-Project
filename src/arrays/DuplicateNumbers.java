package arrays;

import java.util.Arrays;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 1, 5};
        System.out.println(Arrays.toString(removeDuplicateNumbers(arr)));
         int j = removeDuplicateNumbers2(arr);
         for (int i=0; i < j; i++) {
             System.out.print(arr[i] + " ");
         }

    }

    //Removes duplicate numbers in array
    //Algo: Sort the array. Compare adjacent object
    public static int[] removeDuplicateNumbers(int[] input) {
        Arrays.sort(input);

        int[] result = new int[input.length];
        int prev = input[0];
        result[0] = prev;
        int j = 1;

        for (int i = 1; i < input.length; i++) {
            int ch = input[i];
            if (prev != ch) {
                result[j] = ch;
                j++;
            }
            prev = ch;
        }
        return result;
    }

    public static int removeDuplicateNumbers2(int[] input) {
        Arrays.sort(input);
        int j = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != input[i + 1]) {
                input[j++] = input[i];
            }
        }
        input[j++] = input[input.length - 1];
        return j;
    }
}
