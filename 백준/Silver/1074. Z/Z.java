import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int turn = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, n - 1);
        visited(size, r, c);
        System.out.println(turn);
    }

    private static void visited(int size, int r, int c) {
        if (size < 1) {
            return;
        }
        int half = size / 2;
        int pow = (int) Math.pow(size, 2);
        if (r < size) {
            if (c < size) {
                visited(half, r, c);
            } else {
                turn += pow;
                visited(half, r, c - size);
            }
        } else {
            if (c < size) {
                turn += pow * 2;
                visited(half, r - size, c);
            } else {
                turn += pow * 3;
                visited(half, r - size, c - size);
            }
        }
    }
}
