import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isTrue = true;
        StringBuilder sb = new StringBuilder();
        while (isTrue){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) {
                isTrue = false;
                break;
            } else if (b >= a && b % a == 0) {
                sb.append("factor").append("\n");
            } else if (a > b && a % b == 0) {
                sb.append("multiple").append("\n");
            } else {
                sb.append("neither").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
