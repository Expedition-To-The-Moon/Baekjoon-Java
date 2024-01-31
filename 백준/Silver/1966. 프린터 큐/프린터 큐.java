import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<Integer> queue;
    static Queue<Integer> index;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            queue = new LinkedList<>();
            index = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                queue.offer(Integer.parseInt(st.nextToken()));
                index.offer(j);
            }
            int output = outputNum();
            sb.append(output).append('\n');
        }
        System.out.print(sb);
    }

    static int outputNum() {
        int turn = 1;

        while (!queue.isEmpty()) {
            int max = Collections.max(queue);
            int num = queue.poll();
            int idx = index.poll();

            if (num == max) {
                if (n == idx) {
                    break;
                }
                turn++;
            } else {
                queue.offer(num);
                index.offer(idx);
            }
        }
        return turn;
    }
}