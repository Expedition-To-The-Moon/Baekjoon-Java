import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int no = 0;
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int div = n / 2;
            if (div > 1) {
                for(int j = 2; j <= div; j++) {
                    if (n % j == 0) {
                        no++;
                        break;
                    }
                }
            } else if (n == 1) {
                no++;
            }
        }        
        System.out.println(N - no);
    }
}