package numbers;

//Reverse digits of an integer with overflow handled
public class ReverseNumbers {

    public static void main(String[] args) {
        System.out.println(reversDigits(123) );
        System.out.println(reversDigits(1000000045));
        String s = "qwkdjkw\n\nkwqdwqdk\n\nqweqwee";
        System.out.println(s.replace("\n\n", "\n"));

        isPalindrome(585, 2);

    }

    static int reversDigits(int num)
    {
        int rev_num = 0;
        int pre_rev_num = 0;
        while(num > 0)
        {
            int current = num % 10;
            rev_num = rev_num * 10 + current;
            if ((rev_num - current)/10 != pre_rev_num) {
                System.out.println("Overflow warning");
                return 0;
            }
            num = num / 10;
            pre_rev_num = rev_num;
        }
        return rev_num;
    }

    public static boolean isPalindrome(int num, int base) {
        int reversed = 0;
        int temp = num;
        while(temp > 0)  {
            reversed = temp % 10 + reversed * 10;
            temp = temp/10;
        }
        if(reversed == num) {
            //String str = convertToBase(num, base);
//            StringBuilder builder = new StringBuilder(str);
//            String rev = builder.reverse().toString();
//            if(rev.equals(str)) {
//                return true;
//            }
        }
        return false;
    }
}
