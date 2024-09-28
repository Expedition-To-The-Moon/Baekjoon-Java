import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] boards = new int[10][10];
        int maxValue = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                boards[i][j] = Integer.parseInt(st.nextToken());
                if (boards[i][j] > maxValue) {
                    maxValue = boards[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println(row + " " + col);
    }
}
