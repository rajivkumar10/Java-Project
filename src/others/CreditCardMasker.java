package others;

import javax.print.attribute.standard.Sides;

public class CreditCardMasker {
    private static final int SIZE = 6;
    private static final int NO_OF_LAST_CHARS_TO_MASK = 4;

    public static void main(String[] args) {
        String creditCardNumber = "1234567812345678";
        String creditCardNumber2 = "1234-5678-1234-5678";
        String creditCardNumber3 = "12345";
        String creditCardNumber4 = "1qwd-5qwq-78mm-mn22";
        System.out.println(maskify(creditCardNumber));
        System.out.println(maskify(creditCardNumber2));
        System.out.println(maskify(creditCardNumber3));
        System.out.println(maskify(creditCardNumber4));

    }

    public static String maskify(String creditCardNumber) {
        if (creditCardNumber == null || creditCardNumber.isEmpty()) {
            return "";
        }
        if (creditCardNumber.length() < SIZE) {
            return creditCardNumber;
        }
        if (creditCardNumber.replaceAll("\\D", "").length() < SIZE) {
            return creditCardNumber;
        }
        int len = creditCardNumber.length();
        String inner = creditCardNumber.substring(1, len - NO_OF_LAST_CHARS_TO_MASK);
        inner = inner.replaceAll("[0-9]", "#");
        creditCardNumber = creditCardNumber.charAt(0) + inner + creditCardNumber.substring(len - NO_OF_LAST_CHARS_TO_MASK);
        return creditCardNumber;
    }
}
