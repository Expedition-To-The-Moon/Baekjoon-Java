import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] acc = new int[n + 1];
        acc[1] = Integer.parseInt(st.nextToken());
        for (int i = 2; i <= n; i++) {
            acc[i] = acc[i - 1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int mi = Integer.parseInt(st.nextToken()) - 1;
            int mj = Integer.parseInt(st.nextToken());
            int total = acc[mj] - acc[mi];
            sb.append(total).append("\n");
        }
        System.out.println(sb.toString());
    }
}
