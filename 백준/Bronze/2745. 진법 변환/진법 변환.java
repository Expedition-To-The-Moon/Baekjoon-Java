import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        long result = 0;
        int e = 0;
        int num = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = ch - '0';
            } else {
                num = ch - 'A' + 10;
            }
            result += num * (long) Math.pow(b, e++);
        }

        System.out.println(result);
    }
}
