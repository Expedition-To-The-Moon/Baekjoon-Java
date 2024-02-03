import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> stack = new LinkedList<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (idx <= num) {
                for (int j = idx + 1; j <= num; j++) {
                    stack.push(j);
                    idx = j;
                    sb.append("+").append('\n');
                }
            }

            if (stack.getFirst() == num) {
                stack.pop();
                sb.append("-").append('\n');
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}