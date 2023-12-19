import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        br.close();

        int[] alp = new int[26];
        for(int i = 0; i < word.length(); i++) {
            int ch = (int)word.charAt(i);
            if(ch <= 90) {
                int j = ch - 65;
                alp[j]++;
            } else if (ch > 90) {
                int j = ch - 97;
                alp[j]++;
            }
        }

        int n = 0;
        String res = "";
        for(int i = 0; i < 26; i++) {
            if(alp[i] > n) {
                n = alp[i];
                char a = (char)(i + 65);
                res = Character.toString(a);
            } else if(alp[i] == n) {
                res = "?";
            }
        }
        System.out.println(res);
    }   
}