import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static ArrayList<Integer>[] connection;
    private static boolean[] visited;
    private static int[] join;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        connection = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            connection[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d1 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());
            connection[d1].add(d2);
            connection[d2].add(d1);
        }

        join = new int[n + 1];
        visited = new boolean[n + 1];

        isJoin(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(join[i]).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void isJoin(int node) {
        visited[node] = true;
        for (int next : connection[node]) {
            if (!visited[next]) {
                join[next] = node;
                isJoin(next);
            }
        }

    }
}
