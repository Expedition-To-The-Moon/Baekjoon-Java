import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();

        int l = N.length();
        int n = Integer.parseInt(N);
        int min = n - (l * 9);
        int res = 0;
		for (int i = min; i < n; i++) {
            String iStr = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < iStr.length(); j++) {
                int ch =(int)iStr.charAt(j) - '0';
                sum += ch;
            }
            if (n - i == sum) {
                res = i;
                break;
            }
		}
		System.out.print(res);
    }
}