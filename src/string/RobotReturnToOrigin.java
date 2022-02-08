package string;

/**
 * There is a robot starting at the position (0, 0), the origin, on a 2D plane.
 * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
 * <p>
 * You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move.
 * Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
 * <p>
 * Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
 */
public class RobotReturnToOrigin {
    public static void main(String[] args) {
        System.out.println("RLUD : " + checkRobotOrigin("RLUD"));
        System.out.println("RUL : " + checkRobotOrigin("RUL"));
    }

    public static boolean checkRobotOrigin(String moves) {
        char[] arr = moves.toCharArray();
        int U = 0;
        int R = 0;
        for (char c : arr) {
            if (c == 'U') {
                U++;
            }
            else if(c == 'D') {
                U--;
            }
            else if (c == 'R') {
                R++;
            }
            else if(c == 'L') {
                R--;
            }
            else {
                System.out.println("Invalid move "+ c);
                return false;
            }
        }
        return (U == 0 && R == 0);
    }
}
