package blind75;

public class SumOfIntegers {

    public static void main(String[] args) {
        System.out.println(sum(5, 10));
    }

    public static int sum(int a, int b) {
        while(b != 0) {
            int tmp = (a & b) << 1;
            a = a ^ b;
            b = tmp;
        }
        return a;
    }
}
