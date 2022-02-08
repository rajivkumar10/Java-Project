package numbers;

public class FibnocciSeries {
    public static void main(String[] args) {
        System.out.println(fibnocci(8));
        System.out.println(fibDynamic(8));
        fib(8);
    }

    public static Integer fibnocci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibnocci(n - 1) + fibnocci(n - 2);
        }
    }

    public static void fib(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 2; i <= n; i++) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public static int fibDynamic(int n) {
        int fib[] = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] +fib[i-2];
        }
        return fib[n];
    }
}
