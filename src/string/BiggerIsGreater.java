package string;

//Bigger is Greater
//A string is greater than another string if it comes later in a lexicographically sorted list.

import java.util.Arrays;

/**
 * Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:
 * <p>
 * It must be greater than the original word
 * It must be the smallest word that meets the first condition
 */
public class BiggerIsGreater {

    public static void main(String[] args) {
        System.out.println(biggerIsGreater("ecdigf"));
    }

    public static String biggerIsGreater(String str) {
        char[] chars = str.toCharArray();
        int index = 0;

        //Start from the right most character and find the first character that is smaller than previous character.
        for (index = str.length() - 1; index > 0; index--) {
            if (chars[index - 1] < chars[index]) {
                break;
            }
        }
        if (index == 0) {
            return "no answer";
        }
        //Find the smallest character on right side of ‘this character found above ’ that is greater than it
        char firstSmallChar = chars[index - 1];
        int nextSmallCharIndex = index;
        for (int startIndex = index + 1; startIndex < str.length(); startIndex++) {
            if (chars[startIndex] > firstSmallChar && chars[startIndex] < chars[nextSmallCharIndex]) {
                nextSmallCharIndex = startIndex;
            }
        }
        System.out.println(chars[nextSmallCharIndex]);

        //Swap the above found next smallest character with the previous found
        swap(chars, index - 1, nextSmallCharIndex);

        //Sort the array after the changed character
        Arrays.sort(chars, index - 1, str.length());

        return new String(chars);
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
