import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] scores = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            sum += scores[i];
        }
        Arrays.sort(scores);

        System.out.println(sum / 5);
        System.out.println(scores[2]);
    }
}
