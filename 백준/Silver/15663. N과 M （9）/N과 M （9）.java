import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr;
    private static boolean[] visited;
    private static int[] dp;
    private static int n;
    private static int m;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        dp = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        visited = new boolean[n];
        seq(0);
        System.out.println(sb.toString());
    }

    private static void seq(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(dp[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && before != arr[i]) {
                visited[i] = true;
                before = arr[i];
                dp[depth] = arr[i];
                seq(depth + 1);
                visited[i] = false;
            }
        }
    }
}
