import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[100001];
        Queue<Integer> que = new LinkedList<>();
        que.offer(n);
        visited[n] = true;

        int cnt = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int pos = que.poll();

                if (pos == k) {
                    System.out.println(cnt);
                    return;
                }
                if (pos - 1 >= 0 && !visited[pos - 1]) {
                    que.offer(pos - 1);
                    visited[pos - 1] = true;
                }
                if (pos + 1 <= 100000 && !visited[pos + 1]) {
                    que.offer(pos + 1);
                    visited[pos + 1] = true;
                }
                if (pos * 2 <= 100000 && !visited[pos * 2]) {
                    que.offer(pos * 2);
                    visited[pos * 2] = true;
                }
            }
            cnt++;
        }
    }
}