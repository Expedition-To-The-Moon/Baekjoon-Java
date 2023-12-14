import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] res = new int[N];
        for(int n = 0; n < N; n++) {
            res[n] = n + 1;
        }

        for(int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int tmp = 0;
            
            if(i != j) {
                tmp = res[i-1];
                res[i-1] = res[j-1];
                res[j-1] = tmp;
            }
        }
        sc.close();

        for(int r : res) {
            System.out.print(r + " ");
        }
    }
}