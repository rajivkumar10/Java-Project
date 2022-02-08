package string;

public class LongestSequence {
    public static void main(String[] args) {
        longestSequence("AABCDDBBBEA");
    }

    public static void longestSequence(String s) {
        char[] chars = s.toCharArray();
        char max_char = 0;
        int max_count = 0;
        char prev_char = 0;
        int count = 0;
        for (char c : chars) {
            if (prev_char == c) {
                count += 1;
            } else {
                count = 1;
            }
            if (count > max_count) {
                max_count = count;
                max_char = c;
            }
            prev_char = c;
        }
        System.out.println("max char:" + max_char + " count: " + max_count);
    }
}
