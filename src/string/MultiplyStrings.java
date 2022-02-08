package string;

//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
// also represented as a string.
public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println("123 * 456 = " + multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] res = new int[l1 + l2];

        for (int i = l2 - 1; i >= 0; i--) {
            for (int j = l1 - 1; j >= 0; j--) {
                int product = (num1.charAt(j) - '0') * (num2.charAt(i) - '0');
                int sum = product + res[i + j + 1];
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : res) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
