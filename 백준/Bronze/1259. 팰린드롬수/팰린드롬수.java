import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res;
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) {
                break;
            } else {
                String[] arr = s.split("");
                int l = arr.length;
                res = "yes";
                for (int i = 0; i < l / 2; i++) {
                    if (!arr[i].equals(arr[l - 1 - i])) {
                        res = "no";
                        break;
                    }
                }
                System.out.println(res);
            }
        }
    }
}