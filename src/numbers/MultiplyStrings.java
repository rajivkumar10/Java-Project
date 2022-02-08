package numbers;

public class MultiplyStrings {

    public static void main(String[] args) {
        System.out.println(multiply("20", "10"));
    }

    public static String multiply(String num1, String num2) {
        int result = Integer.valueOf(num1) * Integer.valueOf(num2);
        return String.valueOf(result);
    }
}
