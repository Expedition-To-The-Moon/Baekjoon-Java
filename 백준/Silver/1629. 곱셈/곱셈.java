import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(cal(a, b, c));
    }

    private static long cal(int a, int b, int c) {
        long result = 1;
        long init = a % c;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * init) % c;
            }
            init = (init * init) % c;
            b /= 2;
        }

        return result;
    }
}
