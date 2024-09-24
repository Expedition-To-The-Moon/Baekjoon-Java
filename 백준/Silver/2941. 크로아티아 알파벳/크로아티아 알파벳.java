import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alp2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String alp3 = "dz=";
        String str = br.readLine();
        int len = str.length();

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (i < len - 2 && str.substring(i, i + 3).equals(alp3)) {
                cnt++;
                i += 2;
            } else if (i < len - 1) {
                String word = str.substring(i, i + 2);
                boolean found = false;
                for (String a : alp2) {
                    if (word.equals(a)) {
                        found = true;
                        cnt++;
                        i++;
                        break;
                    }
                }
                if (!found) {
                    cnt++;
                }
            } else {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
