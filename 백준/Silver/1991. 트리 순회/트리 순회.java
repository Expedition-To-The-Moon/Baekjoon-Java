import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] nodes;
    private static int n;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        nodes = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = st.nextToken().charAt(0) - 'A' + 1;
            for (int j = 0; j < 2; j++) {
                char node = st.nextToken().charAt(0);
                if (node != '.') {
                    nodes[r][j] = node - 'A'+ 1;
                }
            }
        }

        pre(1);
        sb.append("\n");
        in(1);
        sb.append("\n");
        pos(1);
        System.out.println(sb.toString());
    }

    private static void pre(int cur) {
        if (cur == 0) return;
        sb.append((char) (cur + 'A' - 1));
        pre(nodes[cur][0]);
        pre(nodes[cur][1]);
    }

    private static void in(int cur) {
        if (cur == 0) return;
        in(nodes[cur][0]);
        sb.append((char) (cur + 'A' - 1));
        in(nodes[cur][1]);
    }

    private static void pos(int cur) {
        if (cur == 0) return;
        pos(nodes[cur][0]);
        pos(nodes[cur][1]);
        sb.append((char) (cur + 'A' - 1));
    }
}
