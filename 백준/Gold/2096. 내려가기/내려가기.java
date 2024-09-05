import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] maxGame = new int[n][3];
        int[][] minGame = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            maxGame[i][0] = minGame[i][0] = Integer.parseInt(st.nextToken());
            maxGame[i][1] = minGame[i][1] = Integer.parseInt(st.nextToken());
            maxGame[i][2] = minGame[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            maxGame[i][0] += Math.max(maxGame[i - 1][0], maxGame[i - 1][1]);
            maxGame[i][1] += Math.max(maxGame[i - 1][0], Math.max(maxGame[i - 1][1], maxGame[i - 1][2]));
            maxGame[i][2] += Math.max(maxGame[i - 1][1], maxGame[i - 1][2]);

            minGame[i][0] += Math.min(minGame[i - 1][0], minGame[i - 1][1]);
            minGame[i][1] += Math.min(minGame[i - 1][0], Math.min(minGame[i - 1][1], minGame[i - 1][2]));
            minGame[i][2] += Math.min(minGame[i - 1][1], minGame[i - 1][2]);
        }

        int maxValue = Math.max(maxGame[n - 1][0], Math.max(maxGame[n - 1][1], maxGame[n - 1][2]));
        int minValue = Math.min(minGame[n - 1][0], Math.min(minGame[n - 1][1], minGame[n - 1][2]));
        System.out.println(maxValue + " " + minValue);
    }
}