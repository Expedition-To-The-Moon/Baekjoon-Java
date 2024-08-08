import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] color;
    private static int white = 0;
    private static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        color = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                color[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void divide(int x, int y, int n) {
        if (check(x, y, n)) {
            if (color[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
        } else {
            int half = n / 2;
            divide(x, y, half);
            divide(x + half, y, half);
            divide(x, y + half, half);
            divide(x + half, y + half, half);
        }
    }

    private static boolean check(int x, int y, int n) {
        int startColor = color[x][y];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (color[x + i][y + j] != startColor) {
                    return false;
                }
            }
        }
        return true;
    }
}
