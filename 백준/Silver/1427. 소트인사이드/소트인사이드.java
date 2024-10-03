import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strN = br.readLine().split("");

        int[] intN = new int[strN.length];
        for (int i = 0; i < strN.length; i++) {
            intN[i] = Integer.parseInt(strN[i]);
        }
        Arrays.sort(intN);

        StringBuilder sb = new StringBuilder();
        for (int i = strN.length - 1; i >= 0; i--) {
            sb.append(intN[i]);
        }
        System.out.println(sb.toString());
    }
}
