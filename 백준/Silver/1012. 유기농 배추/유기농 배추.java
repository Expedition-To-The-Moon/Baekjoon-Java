import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static final int[][] dir = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    private static int[][] field;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            field = new int[m][n];
            int[][] pos = new int[k][2];
            visited = new boolean[m][n];
            int larva = 0;
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                pos[j][0] = Integer.parseInt(st.nextToken());
                pos[j][1] = Integer.parseInt(st.nextToken());
                field[pos[j][0]][pos[j][1]] = 1;
            }

            for (int[] p : pos) {
                if (!visited[p[0]][p[1]]) {
                    bfs(m, n, p[0], p[1]);
                    larva++;
                }
            }
            sb.append(larva).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void bfs(int m, int n, int x, int y) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int newX = cur[0];
            int newY = cur[1];

            for (int[] d : dir) {
                int dx = newX + d[0];
                int dy = newY + d[1];

                if (dx >= 0 && dx < m && dy >= 0 && dy < n && !visited[dx][dy] && field[dx][dy] == 1) {
                    visited[dx][dy] = true;
                    que.offer(new int[]{dx, dy});
                }
            }
        }
    }
}