package numbers;

public class LeastPrimeDivisor {

    public static int smallDivisor(int n) {
        if (n % 2 == 0) {
            return 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        //System.out.println(smallDivisor(7));
       // System.out.println(smallDivisor(24));
        System.out.println(smallDivisor(31));
    }
}
