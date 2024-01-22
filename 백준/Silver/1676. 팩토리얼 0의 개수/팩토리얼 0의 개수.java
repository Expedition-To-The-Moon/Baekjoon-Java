import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int cnt2 = 0;
		int cnt5 = 0;
		for (int i = 1; i <= n; i++) {
			int num = i;
			while (num % 2 == 0) {
				cnt2++;
				num /= 2;
			}
			while (num % 5 == 0) {
				cnt5++;
				num /= 5;
			}
		}
		System.out.println(Math.min(cnt2, cnt5));
	}
}