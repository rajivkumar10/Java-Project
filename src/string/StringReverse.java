package string;

import java.security.SecureRandom;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseStringUsingRecursion("rajiv"));
        System.out.println(reverse("kumar"));
        String s = "the sky is blue";
        String []arr = s.split(" ");

    }

    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            builder.append(arr[i]);
        }
        return builder.toString();
    }

    public static String reverseStringUsingRecursion(String str) {
        if (str.length() < 2)
            return str;
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
        //umar + k
        //mar + u
        //ar + m
        // r+ a = ramuk
    }
}
