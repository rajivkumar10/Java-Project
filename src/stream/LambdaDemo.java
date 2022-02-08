package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("america");
        list.add("asi");
        list.add("kwljdkqdj");
        list.add("akl");
        System.out.println(search(list));

        List<Integer> nums = new ArrayList<>();
        nums.add(44);
        nums.add(21);
        nums.add(88);
        nums.add(49);
        nums.add(11);
        nums.add(3);
        System.out.println(getString(nums));
    }

    public static List<String> search(List<String> list) {
        List<String> result = list.stream()
                .map(s -> s.toLowerCase())
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());
        return result;
    }

    public static String getString(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 2 != 0 ? "o" + n : "e" + n)
                .collect(Collectors.joining(","));
    }


}
