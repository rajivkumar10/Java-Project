package numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("15:" + isPrime(15));
        System.out.println("17:" + isPrime(17));

    }

    public static boolean isPrime(int num) {
        /*for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }*/
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
