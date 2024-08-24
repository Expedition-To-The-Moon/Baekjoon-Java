import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int last = b % 4 == 0 ? 4 : b % 4;
            int result = 1;
            for (int j = 0; j < last; j++){
                result = result * a % 10;
            }
            if (result == 0) {
                result = 10;
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb.toString());
    }
}
