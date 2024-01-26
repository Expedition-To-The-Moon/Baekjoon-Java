import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            int money = Integer.parseInt(br.readLine());
            if (money == 0) {
                stack.pop();
            } else {
                stack.push(money);
            }
        }

        int res = 0;
        for (Integer i : stack) {
            res += i;
        }
        System.out.println(res);
    }
}