import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int[][] line;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()) + 1;
        int m = Integer.parseInt(st.nextToken());

        line = new int[n][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            line[u][v] = 1;
            line[v][u] = 1;
        }

        visited = new boolean[n];
        int connect = 0;
        for (int i = 1; i < n; i++) {
            if (!visited[i]) {
                connection(n, i);
                connect++;
            }
        }
        System.out.println(connect);
    }

    private static void connection(int n, int i) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(i);
        visited[i] = true;

        while (!que.isEmpty()) {
            int start = que.poll();
            for (int s = 1; s < n; s++) {
                if (line[start][s] == 1 && !visited[s]) {
                    que.offer(s);
                    visited[s] = true;
                }
            }
        }
    }
}
