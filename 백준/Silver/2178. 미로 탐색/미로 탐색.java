import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[][] dir = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    private static char[][] maze;
    private static boolean[][] visited;
    private static int[][] moves;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        maze = new char[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i] = str.toCharArray();
            }
        }

        int result = bfs(n, m);
        System.out.println(result);
    }

    private static int bfs(int n, int m) {
        moves = new int[n][m];
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{0, 0});
        visited[0][0] = true;
        moves[0][0] = 1;

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];

            for (int[] d : dir) {
                int newX = x + d[0];
                int newY = y + d[1];
                int move = moves[x][y];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && !visited[newX][newY] && maze[newX][newY] == '1') {
                    moves[newX][newY] = move + 1;
                    visited[newX][newY] = true;
                    que.offer(new int[]{newX, newY});
                }
            }
            if (moves[n - 1][m - 1] != 0) {
                return moves[n - 1][m - 1];
            }
        }
        return -1;
    }
}
