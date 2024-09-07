import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    private static int[][] route;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        route = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(route[i], Integer.MAX_VALUE);
        }

        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if (cost < route[start][end]) {
                route[start][end] = cost;
            }
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] cost = minCost(start);
        System.out.println(cost[end]);
    }

    private static int[] minCost(int start) {
        PriorityQueue<int[]> priq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int[] cost = new int[n + 1];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[start] = 0;
        priq.offer(new int[]{start, 0});

        while (!priq.isEmpty()) {
            int[] cur = priq.poll();
            int pos = cur[0];
            int posCost = cur[1];

            if (posCost > cost[pos]) continue;

            for (int i = 1; i <= n; i++) {
                if (route[pos][i] != Integer.MAX_VALUE) {
                    int newCost = cost[pos] + route[pos][i];
                    if (newCost < cost[i]) {
                        cost[i] = newCost;
                        priq.offer(new int[]{i, newCost});
                    }
                }
            }
        }
        return cost;
    }
}
