import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] alp = new int[26];
        Arrays.fill(alp, -1);
        for (int i = 0; i < S.length(); i++) {
            int ch = (int) S.charAt(i);
            int j = ch - 97;
            if(alp[j] == -1){
                alp[j] = i;
            }
        }

        for (int i = 0; i < 26; i++){
            System.out.print(alp[i] + " ");
        }
    }
}