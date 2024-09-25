import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int wordCnt = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Character> chList = new HashSet<>();
            String str = br.readLine();

            boolean isWord = true;
            char ch = str.charAt(0);
            chList.add(ch);

            for (int j = 1; j < str.length(); j++) {
                char curCh = str.charAt(j);
                if (curCh != ch) {
                    if (chList.contains(curCh)) {
                        isWord = false;
                        break;
                    }
                    chList.add(curCh);
                }
                ch = curCh;
            }
            if (isWord) {
                wordCnt++;
            }
        }

        System.out.println(wordCnt);
    }
}
