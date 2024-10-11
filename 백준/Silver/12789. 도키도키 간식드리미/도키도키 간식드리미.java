import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] list = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        possible(n, list);
    }

    static void possible(int n, int[] list) {
        int now = 1;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() == now){
                stack.pop();
                now++;
            }
            if (list[i] == now) {
                now++;
            } else {
                stack.push(list[i]);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == now) {
                stack.pop();
                now++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
