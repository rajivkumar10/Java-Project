package string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("ababa:" + isPalindrome("ababa"));
        System.out.println("test:" + isPalindrome("test"));
        System.out.println("ababa:" + isPalindromeOther("ababa"));
        System.out.println("test:" + isPalindromeOther("test"));
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString()) ? true : false;
    }

    public static boolean isPalindromeOther(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (j > 1) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

