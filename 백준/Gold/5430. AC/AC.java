import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] fun = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            String xStr = br.readLine();

            if (n == 0) {
                xStr = "";
            } else {
                xStr = xStr.substring(1, xStr.length() - 1);
            }

            int start = 0;
            int end = n - 1;
            boolean reversed = false;
            boolean err = false;
            for (String f : fun) {
                if (f.equals("R")) {
                    reversed = !reversed;
                } else if (f.equals("D")) {
                    if (start > end) {
                        sb.append("error");
                        err = true;
                        break;
                    }
                    if (!reversed) {
                        start++;
                    } else if (reversed) {
                        end--;
                    }
                }
            }
            if (!err) {
                String[] x = xStr.split(",");
                sb.append("[");
                if (!reversed) {
                    for (int j = start; j <= end; j++) {
                        sb.append(x[j]);
                        if (j != end) sb.append(",");
                    }
                } else {
                    for (int j = end; j >= start; j--) {
                        sb.append(x[j]);
                        if (j != start) sb.append(",");
                    }
                }
                sb.append("]");
            }
            if (i != t - 1) sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
