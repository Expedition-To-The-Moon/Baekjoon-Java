import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long res = 0;
        long p = 1;
        for (int i = 0; i < L; i++) {
            long alp = (long)s.charAt(i) - 'a';
            res += (alp + 1) * p;
            p = (p * 31) % 1234567891;
        }
        System.out.println(res % 1234567891);
    }
}