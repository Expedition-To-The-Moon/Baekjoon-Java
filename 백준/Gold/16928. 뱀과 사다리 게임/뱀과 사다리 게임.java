import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] lab = new int[n][2];
        int[][] snake = new int[m][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            lab[i][0] = Integer.parseInt(st.nextToken());
            lab[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            snake[i][0] = Integer.parseInt(st.nextToken());
            snake[i][1] = Integer.parseInt(st.nextToken());
        }

        int result = game(lab, snake, n, m);
        System.out.println(result);
    }

    private static int game(
            int[][] lab, int[][] snake, int n, int m
    ) {
        int[] board = new int[101];
        boolean[] visited = new boolean[101];

        for (int i = 1; i < 101; i++) {
            board[i] = i;
        }

        for (int l[] : lab) {
            board[l[0]] = l[1];
        }

        for (int s[] : snake) {
            board[s[0]] = s[1];
        }

        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{1, 0});

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int pos = cur[0];
            int move = cur[1];

            if (pos == 100) {
                return move;
            }

            for (int i = 1; i <= 6; i++) {
                int next = pos + i;
                if (next <= 100 && !visited[next]) {
                    visited[next] = true;
                    que.offer(new int[]{board[next], move + 1});
                }
            }
        }
        return -1;
    }
}
