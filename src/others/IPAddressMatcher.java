package others;

import java.util.regex.Pattern;

public class IPAddressMatcher {

    private static final String regx =  "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    private static final Pattern pattern = Pattern.compile(regx);

    private static final String regxIpV6 = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

    private static final Pattern ipV6Pattern = Pattern.compile(regxIpV6);

    public static boolean isValid(String ip) {
        return pattern.matcher(ip).matches();
    }
    public static boolean isValidIpV6(String ip) {
        return ipV6Pattern.matcher(ip).matches();
    }


    public static void main(String[] args) {
        String ip = "127.0.0.1";
        String ipV6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";

        String str="he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";
        String [] arr = str.split(" ");
        String reg = "[a-zA-Z-]+$";
        Pattern p = Pattern.compile(reg);
        int count = 0;
        for(int i = 0; i <arr.length;i++) {
            String s= arr[i].replace(",","").replace(".","").replace("?","").replace("!","");
            if(p.matcher(s).matches()) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);

       // System.out.println(isValid(ip));
       // System.out.println(isValidIpV6(ipV6));
    }
}
