package others;

public class PyramidPattern {

    public static void main(String[] args) {
        printPattern(9);
    }
    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            int noOfWhiteSpaces = rows - i;
            printString(" ", noOfWhiteSpaces);
            printString(i + " ", i);
            System.out.println();
        }
        System.out.println("########################33333");
        for (int i = rows; i >= 1; i--) {
            int noOfWhiteSpaces = rows - i;
            printString(" ", noOfWhiteSpaces);
            printString(i + " ", i);
            System.out.println();
        }
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
    }
}
