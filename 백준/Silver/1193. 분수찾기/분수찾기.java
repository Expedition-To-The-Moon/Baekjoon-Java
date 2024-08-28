import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if (x == 1) {
            System.out.println("1/1");
            return;
        }

        int i = 1;
        while (i < x) {
            x -= i;
            i++;
        }

        int top = 0;
        int bot = 0;
        if (i % 2 == 0) {
            top = x;
            bot = i - x + 1;
        } else {
            top = i - x + 1;
            bot = x;
        }
        System.out.println(top + "/" + bot);
    }
}
