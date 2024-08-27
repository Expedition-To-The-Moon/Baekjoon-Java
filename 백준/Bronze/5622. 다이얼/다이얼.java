import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] alp = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] words = br.readLine().split("");

        int minTime = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < 8; j++) {
                if (alp[j].contains(words[i])) {
                    minTime += j + 3;
                }
            }
        }

        System.out.println(minTime);
    }
}
