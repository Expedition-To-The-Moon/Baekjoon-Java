import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int[][] dir = {
            {-1, 0, 0}, {1, 0, 0}, // 상 하
            {0, -1, 0}, {0, 1, 0}, // 좌 우
            {0, 0, 1}, {0, 0, -1}  // 앞 뒤
    };
    private static int[][][] boxes;
    private static int h, n, m;
    private static boolean[][][] visited;
    private static Queue<int[]> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        boxes = new int[h][n][m];
        visited = new boolean[h][n][m];
        for (int h0 = 0; h0 < h; h0++) {
            for (int n0 = 0; n0 < n; n0++) {
                st = new StringTokenizer(br.readLine());
                for (int m0 = 0; m0 < m; m0++) {
                    boxes[h0][n0][m0] = Integer.parseInt(st.nextToken());
                    if (boxes[h0][n0][m0] == 1) {
                        que.offer(new int[]{h0, n0, m0});  // 큐에 올바른 좌표를 추가
                        visited[h0][n0][m0] = true;
                    }
                }
            }
        }

        int result = bfs();
        System.out.println(result);
    }

    static int bfs() {
        int day = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            boolean cycle = false;

            for (int i = 0; i < size; i++) {
                int[] cur = que.poll();
                int x = cur[0];
                int y = cur[1];
                int z = cur[2];

                for (int[] d : dir) {
                    int newX = x + d[0];
                    int newY = y + d[1];
                    int newZ = z + d[2];

                    if (newX >= 0 && newX < h && newY >= 0 && newY < n && newZ >= 0 && newZ < m
                            && !visited[newX][newY][newZ] && boxes[newX][newY][newZ] == 0) {
                        boxes[newX][newY][newZ] = 1;
                        que.offer(new int[]{newX, newY, newZ});
                        visited[newX][newY][newZ] = true;
                        cycle = true;
                    }
                }
            }

            if (cycle) day++;
        }

        for (int h0 = 0; h0 < h; h0++) {
            for (int n0 = 0; n0 < n; n0++) {
                for (int m0 = 0; m0 < m; m0++) {
                    if (boxes[h0][n0][m0] == 0) {
                        return -1;
                    }
                }
            }
        }
        return day;
    }
}
