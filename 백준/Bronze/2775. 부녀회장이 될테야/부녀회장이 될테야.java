import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();   
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int k = 0; k <= K; k++) {
                int sum = 0;
                for (int n = 0; n < N; n++) {
                    if(k == 0) {
                        arr[n] = n+1;
                    } else {
                        sum += arr[n];
                        arr[n] = sum;
                    }
                }
            }
            System.out.println(arr[N-1]);
        }
        sc.close();
    }
}