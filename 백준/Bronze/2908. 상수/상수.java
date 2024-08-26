import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String reA = "";
        String reB = "";
        for (int i = 0; i < 3; i++) {
            reA += a % 10;
            a /= 10;
            reB += b % 10;
            b /= 10;
        }

        String result = Integer.parseInt(reA) > Integer.parseInt(reB) ? reA : reB;
        System.out.println(result);
    }
}
