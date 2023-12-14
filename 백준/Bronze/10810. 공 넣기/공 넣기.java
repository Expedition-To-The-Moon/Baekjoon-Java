import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] res = new int[N];
        for(int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            i -= 1;
            for(; i<j; i++) {
                res[i] = k;
            }
        }
        sc.close();

        for(int r : res) {
            System.out.print(r + " ");
        }
    }
}