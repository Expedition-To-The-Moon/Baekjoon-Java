import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> list = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        ArrayList<String> rep = new ArrayList<>();

        for (int i = 0; i < n + m; i++) {
            String name = br.readLine();
            int s = list.size();
            list.add(name);
            if (s == list.size()) {
                rep.add(name);
            }
        }
        Collections.sort(rep);

        sb.append(rep.size()).append("\n");
        for (String r : rep) {
            sb.append(r).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
