import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int[][] dir = {
            {-1, 0}, {1, 0}, // 상 하
            {0, -1}, {0, 1}  // 좌 우
    };
    private static int[][] boxes;
    private static int n, m;
    private static boolean[][] visited;
    private static Queue<int[]> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        boxes = new int[n][m];
        visited = new boolean[n][m];
        for (int n0 = 0; n0 < n; n0++) {
            st = new StringTokenizer(br.readLine());
            for (int m0 = 0; m0 < m; m0++) {
                boxes[n0][m0] = Integer.parseInt(st.nextToken());
                if (boxes[n0][m0] == 1) {
                    que.offer(new int[]{n0, m0});  // 큐에 올바른 좌표를 추가
                    visited[n0][m0] = true;
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

                for (int[] d : dir) {
                    int newX = x + d[0];
                    int newY = y + d[1];

                    if (newX >= 0 && newX < n && newY >= 0 && newY < m
                            && !visited[newX][newY] && boxes[newX][newY] == 0) {
                        boxes[newX][newY] = 1;
                        que.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                        cycle = true;
                    }
                }
            }

            if (cycle) day++;
        }

        for (int n0 = 0; n0 < n; n0++) {
            for (int m0 = 0; m0 < m; m0++) {
                if (boxes[n0][m0] == 0) {
                    return -1;
                }
            }
        }
        return day;
    }
}
