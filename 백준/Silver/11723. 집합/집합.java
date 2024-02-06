import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int bit = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cal = st.nextToken();
            int num = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
            collection(cal, num, bw);
        }

        bw.flush();
        bw.close();
    }

    static void collection(String cal, int num, BufferedWriter bw) throws IOException {
        if (cal.equals("add")) {
            bit |= (1 << num);
        } else if (cal.equals("remove")) {
            bit &= ~(1 << num);
        } else if (cal.equals("check")) {
            bw.write((bit & (1 << num)) != 0 ? "1\n" : "0\n");
        } else if (cal.equals("toggle")) {
            bit ^= (1 << num);
        } else if (cal.equals("all")) {
            bit = (1 << 21) - 2;
        } else if (cal.equals("empty")) {
            bit = 0;
        }
    }
}
