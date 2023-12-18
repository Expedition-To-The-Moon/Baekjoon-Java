import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            int l = str.length();
            String s = str.substring(0, 1);
            String e = str.substring(l - 1, l);
            System.out.println(s + e);
        }
        br.close();
    }   
}