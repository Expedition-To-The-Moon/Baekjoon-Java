import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[30];
        for(int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            list[n-1] = 1; 
        }
        sc.close();

        int[] res = new int[2];
        int idx = 0;
        for(int i = 0; i < 30; i++) {
            int num = list[i];
            if(num != 1) {
                res[idx] = i+1;
                idx++;
            }
        }
        Arrays.sort(res);
        for(int i : res) {
            System.out.println(i);
        }
    }
}