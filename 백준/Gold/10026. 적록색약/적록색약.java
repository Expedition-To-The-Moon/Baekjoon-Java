import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static int[][] dir = {
            {-1, 0}, {1, 0},
            {0, -1}, {0, 1}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] rgbVisited = new boolean[n][n];
        boolean[][] rgVisited = new boolean[n][n];

        char[][] area = new char[n][n];
        for (int i = 0; i < n; i++) {
            area[i] = br.readLine().toCharArray();
        }

        int rgb = 0;
        int rg = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!rgbVisited[i][j]) {
                    bfs(area, rgbVisited, i, j, n, true);
                    rgb++;
                }
                if (!rgVisited[i][j]) {
                    bfs(area, rgVisited, i, j, n, false);
                    rg++;
                }
            }
        }
        System.out.println(rgb + " " + rg);
    }

    private static void bfs(
            char[][] area, boolean[][] visited,
            int x, int y, int n, boolean color
    ) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{x, y});
        visited[x][y] = true;
        char curColor = area[x][y];

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int dx = cur[0];
            int dy = cur[1];

            for (int[] d : dir) {
                int newX = dx + d[0];
                int newY = dy + d[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < n && !visited[newX][newY]) {
                    if (color) {
                        if (curColor == area[newX][newY]) {
                            visited[newX][newY] = true;
                            que.offer(new int[]{newX, newY});
                        }
                    } else {
                        if ((curColor == 'R' || curColor == 'G') && (area[newX][newY] == 'R' || area[newX][newY] == 'G')) {
                            visited[newX][newY] = true;
                            que.offer(new int[]{newX, newY});
                        } else if (curColor == area[newX][newY]) {
                            visited[newX][newY] = true;
                            que.offer(new int[]{newX, newY});
                        }
                    }
                }
            }
        }
    }
}
