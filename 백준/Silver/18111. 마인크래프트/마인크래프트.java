import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] area;
    static int n;
    static int m;
    static int b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        area = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        maxHeight();
    }

    static void maxHeight() {
        int minTime = Integer.MAX_VALUE;
        int maxH = 0;

        for(int h = 256; h >= 0; h--) {
            int add = 0;
            int del = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int a = area[i][j] - h;
                    if (a > 0) {
                        del += a;
                    } else if (a < 0) {
                        add -= a;
                    }
                }
            }

            if (add - del <= b) {
                int time = del * 2 + add;
                if (time < minTime) {
                    minTime = time;
                    maxH = h;
                }
            }
        }
        System.out.println(minTime + " " + maxH);
    }
}
