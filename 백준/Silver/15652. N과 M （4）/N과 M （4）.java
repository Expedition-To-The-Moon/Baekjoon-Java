import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        seq(1, 0);
        System.out.println(sb.toString());
    }

    private static void seq(int num, int depth) {
        if (depth == m) {
            for (int a : arr) {
                sb.append(a).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = num; i <= n; i++) {
            arr[depth] = i;
            seq(i, depth + 1);
        }
    }
}