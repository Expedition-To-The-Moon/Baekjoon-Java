import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] li = new int[N];
        for(int i = 0; i < N; i++){
            li[i] = i + 1;
        }

        for(int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp;
            while(i != j) {
                tmp = li[i-1];
                li[i-1] = li[j-1];
                li[j-1] = tmp;
                if(j-i >= 2) {
                    i++;
                    j--;
                } else {
                    break;
                }
            }
        }
        for(int l : li) {
            System.out.print(l + " ");
        }
    }
}
