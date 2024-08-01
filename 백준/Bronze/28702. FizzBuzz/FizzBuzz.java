import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if (str.matches("\\d+")) {
                int num = (3 - i) + Integer.parseInt(str);
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (num % 3 == 0) {
                    System.out.println("Fizz");
                } else if (num % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(num);
                }
                return;
            }
        }
        br.close();
    }
}