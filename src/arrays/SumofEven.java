package arrays;

import java.util.Arrays;

//Sum of even values and update queries on an array
/*
Given an array arr[] of integers and an array q[] of queries.
For the ith query, index = q[i][0] and value = q[i][1].
The task is for every query, update arr[index] = arr[index] + value and
then return the sum of all the even elements from the array.
 */
public class SumofEven {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[][] query = {{0, 1}, {1, 3}, {0, -4}, {3, 2}};
        balanceArray(arr, query);
    }

    public static void balanceArray(int[] arr, int[][] query) {
        int[] result = new int[query.length];
        int sum = 0;
        for (int i = 0; i < query.length; i++) {
            int index = query[i][0];
            int value = query[i][1];
            sum = evenSum(arr, index, value);
            result[i] = sum;
        }
        System.out.println(Arrays.toString(result));
    }

    public static int evenSum(int[] arr, int index, int value) {
        arr[index] = arr[index] + value;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }


}
