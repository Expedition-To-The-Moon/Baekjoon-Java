import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isTrue = true;
        StringBuilder sb = new StringBuilder();
        while (isTrue) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                isTrue = false;
                return;
            }
            System.out.println(str);
        }
    }
}
