import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[][] dir = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    private static int[][] map;
    private static boolean[][] visited;
    private static int[][] moves;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        int[] start = new int[2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        bfs(start, n , m);

        StringBuilder sb = new StringBuilder();
        for (int[] move : moves) {
            for (int cnt : move) {
                sb.append(cnt).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int[] start, int n, int m) {
        visited = new boolean[n][m];
        moves = new int[n][m];

        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{start[0], start[1]});
        visited[start[0]][start[1]] = true;
        moves[start[0]][start[1]] = 0;

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int move = moves[x][y];

            for (int[] d : dir) {
                int newX = x + d[0];
                int newY = y + d[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && !visited[newX][newY] && map[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    que.offer(new int[]{newX, newY});
                    moves[newX][newY] = move + 1;
                }
            }
        }
        // 이동 불가능 지역
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    moves[i][j] = -1;
                }
            }
        }
    }
}
