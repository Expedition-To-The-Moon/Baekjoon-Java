import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    static LinkedList<Integer> stack;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        isPossible();
    }

    static void isPossible() {
        StringBuilder sb = new StringBuilder();
        boolean possible = true;
        int idx = 0;
        int i = 1;

        stack = new LinkedList<>();
        while (idx < arr.length) {
            if (i <= arr[idx]) {
                stack.push(i);
                sb.append("+").append('\n');
                while (!stack.isEmpty() && stack.peek() == arr[idx]) {
                    stack.pop();
                    sb.append("-").append('\n');
                    idx++;
                }
                i++;
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        } 
    }
}