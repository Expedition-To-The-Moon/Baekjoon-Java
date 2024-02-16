import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int pair;
    static int[][] pairs;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        pair = Integer.parseInt(br.readLine());
        pairs = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < pair; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            pairs[f][s] = pairs[s][f] = 1;
        }
        isVisit();

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (visit[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static void isVisit() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (pairs[cur][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
