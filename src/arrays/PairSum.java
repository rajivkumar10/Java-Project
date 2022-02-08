package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Program to find two elements in array that sum to n
 */
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int n = 17;
        System.out.println("Given array : " + Arrays.toString(arr));
        System.out.println("Given sum : " + n);
        printPairs(arr, n);
        System.out.println("Pairs using set");
        printPairsUsingSet(arr, n);
        System.out.println("Pairs using pointer");
        printPairsUsingPointers(arr, n);
    }

    //Algo 1: take one number from the array and then loop through array and output pairs which is equal to given sum. O(n^2)
    public static void printPairs(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int second = arr[j];
                if ((first + second) == n) {
                    System.out.printf("(%d,%d) %n", first, second);
                }
            }
        }
    }

    //Algo 2: to store all numbers in a hashtable and just check if it contains second value in a pair. O(n)
    public static void printPairsUsingSet(int[] arr, int n) {
        Set set = new HashSet(arr.length);

        for (int num : arr) {
            int target = n - num;
            if (!set.contains(target)) {
                set.add(num);
            } else {
                System.out.printf("(%d,%d) %n", num, target);
            }
        }
    }

    //Algo 3: Sort the array and use two pointers to scan through array from both direction i.e. beginning and end.
    // If sum of both the values are equal to given number then we output the pair and advance them.
    // If the sum of two numbers is less than k then we increase the left pointer,
    // else if the sum is greater than k we decrement the right pointer, until both pointers meet at some part of the array.
    public static void printPairsUsingPointers(int[] arr, int n) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum ==n) {
                System.out.printf("(%d,%d) %n", arr[left], arr[right]);
                left++;
                right--;
            } else if(sum < n) {
                left++;
            } else if(sum > n) {
                right--;
            }
        }
    }
}