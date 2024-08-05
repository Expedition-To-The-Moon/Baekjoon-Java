import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char cal = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                if (cal == 'I') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (cal == 'D' && !map.isEmpty()) {
                    int del = 0;
                    if (num == 1) {
                        del = map.lastKey();
                    } else if (num == -1) {
                        del = map.firstKey();
                    }

                    if (map.get(del) == 1) {
                        map.remove(del);
                    } else {
                        map.put(del, map.get(del) - 1);
                    }
                }
            }
            if (map.isEmpty()) {
                sb.append("EMPTY");
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey());
            }
            if (i != t - 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
