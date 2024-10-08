import java.io.*;
import java.util.Stack;

public class Main {

    private static Stack<Integer> stack;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            if (!nums[0].equals("1")) {
                command(nums[0]);
            } else {
                stack.push(Integer.parseInt(nums[1]));
            }
        }

        System.out.println(sb.toString());
    }

    private static void command(String num) {
        if (num.equals("2")) {
            if (!stack.isEmpty()) {
                sb.append(stack.pop()).append('\n');
            } else {
                sb.append("-1").append('\n');
            }
        } else if (num.equals("3")) {
            sb.append(stack.size()).append('\n');
        } else if (num.equals("4")) {
            if (stack.isEmpty()) {
                sb.append("1").append('\n');
            } else {
                sb.append("0").append('\n');
            }
        } else if (num.equals("5")) {
            if (!stack.isEmpty()) {
                sb.append(stack.peek()).append('\n');
            } else {
                sb.append("-1").append('\n');
            }
        }
    }
}
