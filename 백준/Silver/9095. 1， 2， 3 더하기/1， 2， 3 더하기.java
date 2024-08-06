import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] dp = new int[11];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        for (int i = 2; i < 10; i++) {
            dp[i + 1] =  dp[i] + dp[i - 1] + dp[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
