import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int nu = 1;
		int dn = 1;
		// 	nu = N * ... *(N - K)
		for (int i = K + 1; i <= N; i++) {
			nu *= i; 
		}
		// dn = (N - K)!
		for (int i = 1; i <= N - K; i++) {
			dn *= i;
		}
		System.out.println(nu / dn);
	}
}