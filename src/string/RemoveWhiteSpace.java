package string;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpace("Hello World"));
    }

    public static String removeWhiteSpace(String str) {
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : arr) {
            if (!Character.isWhitespace(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}

