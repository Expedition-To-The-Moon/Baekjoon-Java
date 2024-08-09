import java.io.*;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (map.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    int min = map.firstKey();
                    sb.append(min).append('\n');
                    if (map.get(min) == 1) {
                        map.remove(min);
                    } else {
                        map.put(min, map.get(min) - 1);
                    }
                }
            } else {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        System.out.println(sb.toString());
    }
}
