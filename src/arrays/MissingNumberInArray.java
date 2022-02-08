package arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        int missingNum = findMissingNumber(arr, arr.length);
        System.out.println(missingNum);
    }

    //finds 1 missing number
    public static int findMissingNumber(int[] arr, int count) {
        int expectedSum = (count + 1) * (count + 2) / 2; //n * (n+1)/2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
