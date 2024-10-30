import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            int remainder = n % b;
            n /= b;
            list.add(remainder);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) >= 10) {
                char ch = (char) ('A' + (list.get(i) - 10));
                sb.append(ch);
            } else {
                sb.append(list.get(i));
            }
        }

        System.out.println(sb.toString());
    }
}
