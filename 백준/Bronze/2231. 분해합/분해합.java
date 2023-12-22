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
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (n - i == sum) {
                res = i;
                break;
            }
		}
		System.out.print(res);
    }
}