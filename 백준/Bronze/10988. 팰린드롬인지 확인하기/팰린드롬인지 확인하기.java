import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String reStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reStr += str.charAt(i);
        }

        if (reStr.equals(str)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
