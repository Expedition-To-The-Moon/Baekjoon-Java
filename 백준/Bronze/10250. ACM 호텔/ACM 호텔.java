import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st2.nextToken());
            int W = Integer.parseInt(st2.nextToken());
            int N = Integer.parseInt(st2.nextToken());

            int y, x;
            if (N % H == 0) {
                y = H;
                x = N / H;
            } else {
                y = N % H;
                x = N / H + 1;
            }
            System.out.println((y * 100) + x);
        }
    }
}