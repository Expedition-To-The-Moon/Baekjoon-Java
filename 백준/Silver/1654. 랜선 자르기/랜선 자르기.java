import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int k;
    static int n;
    static int[] cable;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        cable = new int[k];
        for (int i = 0; i < k; i++) {
            cable[i] = Integer.parseInt(br.readLine());
        }
        maxLen();
    }

    static void maxLen() {
        long min = 1;
        long max = Arrays.stream(cable).max().getAsInt();
        long res = 0;

        while (min <= max) {
            long mid = (min + max) / 2;
            long num = 0;

            for (int c : cable) {
                num += c / mid;
            }

            if (num >= n) {
                res = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(res);
    }
}