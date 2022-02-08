package blind75;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1};
        System.out.println("Found duplicate {1, 2, 3, 4, 1}: " + checkDuplicates(arr1));
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("Found duplicate {1, 2, 3, 4}: " + checkDuplicates(arr2));
    }

    public static boolean checkDuplicates(int[] arr) {
        Set set = new HashSet<>();
        for (int n : arr) {
            if(set.contains(n))  {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
