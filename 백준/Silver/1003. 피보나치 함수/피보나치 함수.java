import java.io.*;

public class Main {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        fibonacci();

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n][0] + " " + dp[n][1] + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void fibonacci() {
        dp = new int[41][2];
        dp[0][0] = dp[1][1] = 1;
        dp[0][1] = dp[1][0] = 0;

        for (int i = 2; i < 41; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }
    }
}
