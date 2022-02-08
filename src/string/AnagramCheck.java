package string;

import java.util.Arrays;

/**
 * This program whether two strings are anagram or not. e.g stop & pots
 */
public class AnagramCheck {

    public static void main(String[] args) {
        System.out.println(isAnagram("stop", "pots"));
        System.out.println(isAnagram("stop", "potr"));
        System.out.println(isAnagramUsingArrays("stop", "pots"));

        System.out.println("Characters to remove: " + remAnagram("bcadeh", "hea"));
    }

    //Algo1 : Convert first string to array. Iterate the array and find each character in second string.
    // If character is found, delete it from string else return false.
    // If all charcters found in second string then return true else false.

    public static boolean isAnagram(String str1, String str2) {
        char[] chars = str1.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(str2);
        for (char ch : chars) {
            int index = stringBuilder.indexOf("" + ch);
            if (index != -1) {
                stringBuilder.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return stringBuilder.length() == 0 ? true : false;
    }

    //Algo2: Convert both strings to array. Sort both the arrays.
    // Compare both the arrays, if both equals return true else false.
    public static boolean isAnagramUsingArrays(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    //Calculates number of characters to be removed to make 2 strings anagram
    public static int remAnagram(String str1, String str2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            count2[str2.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(count1));
        System.out.println(Arrays.toString(count2));

        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(count1[i] - count2[i]);
        }
        return result;
    }
}
