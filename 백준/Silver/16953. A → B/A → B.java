import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = cal(a, b);
        System.out.println(result);
    }

    private static int cal(int a, int b) {
        int cnt = 1;

        while (a < b) {
            if (b % 2 == 0) {
                cnt++;
                b /= 2;
            } else if (b % 10 == 1) {
                cnt++;
                b /= 10;
            } else {
                return -1;
            }
        }

        if (b == a) {
            return cnt;
        }
        return -1;
    }
}
