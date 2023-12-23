import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }

        int res = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr.get(i) +  arr.get(j) +  arr.get(k);
                    if (sum <= M) {
                        if (sum >= res) {
                            res = sum;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}