package arrays;

//Count total derangements
//Permutation such that no element appears in its original position
//For example, a derangement of {0, 1, 2, 3} is {2, 3, 1, 0}.
//algo : countDer(n) = (n - 1) * [(countDer(n - 1) + countDer(n - 2))]
public class CountDerangements {
    public static void main(String args[]) {
        int n = 3;
        System.out.println(countDerangements(n));
    }

    public static int countDerangements(int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else {
            return (n - 1) * (countDerangements(n - 1) + countDerangements(n - 2));
        }
    }
}
