import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();

        int res = 1;
        int num = 1;
        while (num < N) {
            num += (6 * res);
            res++;
        }
        System.out.println(res);
	}
}