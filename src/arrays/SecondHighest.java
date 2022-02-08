package arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {17,5,6,11,4,12};
        findSecondHighest(arr);
    }

    public static void findSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            }
            else if(arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }
        System.out.println(secondHighest);
    }
}
