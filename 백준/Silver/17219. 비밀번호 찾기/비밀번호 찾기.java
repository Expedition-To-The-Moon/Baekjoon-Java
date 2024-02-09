import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> list = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String addr = st.nextToken();
            String pass = st.nextToken();
            list.put(addr, pass);
        }

        for (int i = 0; i < m; i++) {
            sb.append(list.get(br.readLine())).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
