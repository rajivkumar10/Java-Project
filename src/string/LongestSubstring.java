package string;

import java.util.HashMap;

//Longest Substring Without Repeating Characters
public class LongestSubstring {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.print(getLongestSubstringLength(str));
    }

    public static int getLongestSubstringLength(String str) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int start = 0;
        int max_length = 0;
        for (int end = 0; end < str.length(); end++) {
            if (seen.containsKey(str.charAt(end))) {
                System.out.print(str.charAt(end) + " ");
                start = Math.max(start, seen.get(str.charAt(end))+ 1);
            }
            seen.put(str.charAt(end), end);
            max_length = Math.max(max_length, end - start + 1);
        }

        return max_length;
    }
}
