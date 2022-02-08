package threads;

public class OddEvenPrint {
    int count = 1;
    boolean isOdd;

    public OddEvenPrint() {
        isOdd = true;
    }

    public void printOdd(int max) {
        synchronized (this) {
            while (count < max) {
                while(!isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(count++);
                isOdd = false;
                notify();

            }
        }
    }

    public void printEven(int max) {
        synchronized (this) {
            while (count < max) {
                while(isOdd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(count++);
                isOdd = true;
                notify();
            }
        }
    }


    public static void main(String[] args) {
        OddEvenPrint oddEvenPrint = new OddEvenPrint();
        int max = 10;

        Thread t1 = new Thread(() -> {
            oddEvenPrint.printOdd(max);
        });

        Thread t2 = new Thread(() -> {
            oddEvenPrint.printEven(max);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
