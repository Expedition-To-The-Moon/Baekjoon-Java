import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];

        double level = 0;
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(score);

        int out = (int) Math.round(n * 0.15);
        for (int i = out; i < n - out; i++) {
            level += score[i];
        }
        System.out.println((int) Math.round(level / (n - 2 * out)));
    }
}