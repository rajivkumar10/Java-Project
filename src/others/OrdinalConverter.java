package others;

/**
 * Finish the function numberToOrdinal, which should take a number
 * and return it as a string with the correct ordinal indicator suffix (in English).
 * That is:
 * numberToOrdinal(1) ==> '1st'
 * numberToOrdinal(2) ==> '2nd'
 * numberToOrdinal(3) ==> '3rd'
 * numberToOrdinal(4) ==> '4th'
 * ... and so on
 * For the purposes of this challenge, you may assume that the function will always
 * be passed a non-negative integer. If the function is given 0 as an argument, it should return '0' (as a string).
 */
public class OrdinalConverter {

    private static final int EDGE_CASE = 10;
    public static void main(String[] args) {
        OrdinalConverter ordinalConverter = new OrdinalConverter();
        System.out.println(ordinalConverter.numberToOrdinal(21));
    }

    public String numberToOrdinal(Integer num) {
        String suffix;
        if (num == 0) {
            return num.toString();
        }
        if (isEdgeCase(num)) {
            suffix = "th";
        } else {
            suffix = getSuffix(num);
        }
        return num + suffix;
    }

    private boolean isEdgeCase(Integer num) {
        int mod10 = num % 10;
        int mod100 = num % 100;
        return ((mod100 - mod10) == EDGE_CASE);
    }

    private String getSuffix(Integer num) {
        int n = num % 10;
        String suffix;
        switch(n) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
        }
        return suffix;

    }
}
