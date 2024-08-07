import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dot = new int[n];
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            dot[i] = Integer.parseInt(st.nextToken());
            seq[i] = dot[i];
        }
        Arrays.sort(seq);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int rank = 0;
        for (int s : seq) {
            if (!map.containsKey(s)) {
                map.put(s, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int d : dot) {
            sb.append(map.get(d)).append(" ");
        }
        System.out.println(sb.toString());
    }
}
