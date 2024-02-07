import java.io.*;
import java.util.*;

public class Main {
    static Map<Integer, String> dicName;
    static Map<String, Integer> dicNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dicName = new HashMap<>();
        dicNum = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            dicName.put(i, str);
            dicNum.put(str, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (isTrue(str)) {
                int idx = Integer.parseInt(str);
                sb.append(dicName.get(idx - 1) + "\n");
            } else {
                int idx = dicNum.getOrDefault(str, -1) + 1;
                sb.append(idx  + "\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static boolean isTrue(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
