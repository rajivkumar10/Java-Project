package others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.ToDoubleBiFunction;

public class Calculator {
    private static Map<String, ToDoubleBiFunction<Double, Double>> operations = new HashMap<>();
    private static Stack<Double> stack = new Stack<>();

    public Calculator() {
        populateOperations();
    }

    private void populateOperations() {
        operations.put("/", (arg1, arg2) -> (arg1 / arg2));
        operations.put("*", (arg1, arg2) -> (arg1 * arg2));
        operations.put("+", (arg1, arg2) -> (arg1 + arg2));
        operations.put("-", (arg1, arg2) -> (arg1 - arg2));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String expr1 = "4 2 2";
        String expr2 = "3 5 *";
        String expr3 = "4 5 +";
        String expr4 = "8 4 -";
        System.out.println(calculate(expr1));
        System.out.println(calculate(expr2));
        System.out.println(calculate(expr3));
        System.out.println(calculate(expr4));
    }

    public static double calculate(String expr) {
        if (expr == null || expr.isEmpty()) {
            return 0.0;
        }
        Arrays.stream(expr.split(" ")).forEach(input -> {
            if (operations.containsKey(input)) {
                Double arg2 = stack.pop();
                Double arg1 = stack.pop();
                Double result = operations.get(input).applyAsDouble(arg1, arg2);
                stack.push(result);
            }
            else {
                stack.push(Double.parseDouble(input));
            }
        });
        return stack.pop();
    }
}
