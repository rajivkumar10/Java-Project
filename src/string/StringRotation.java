package string;

public class StringRotation {
    public static void main(String[] args) {
        System.out.println("java2blog and blogjava2 are rotation strings : " + isRotation("java2blog", "blogjava2"));
        System.out.println("java2blog and blog2java are rotation strings : " + isRotation("java2blog", "blog2java"));
    }

    public static boolean isRotation(String s1, String s2) {
        String s3 = s1 + s1;
        return s3.contains(s2) ? true : false;
    }
}
