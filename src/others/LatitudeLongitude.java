package others;

import java.util.regex.Pattern;

public class LatitudeLongitude {
    private static final String regx = "^(-?\\d+(\\.\\d+)?),(-?\\d+(\\.\\d+)?)$";
    private static final Pattern pattern = Pattern.compile(regx);

    public static boolean isValidLocation(String location) {
        return pattern.matcher(location).matches();
    }

    public static void main(String[] args) {
        String location = "9.9824245,76.5703886";
        System.out.println(isValidLocation(location));
    }
}
