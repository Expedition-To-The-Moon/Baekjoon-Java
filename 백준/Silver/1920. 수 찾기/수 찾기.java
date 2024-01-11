import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		// N 배열
		int n = Integer.parseInt(br.readLine());
		String[] nStr = br.readLine().split(" ");

		HashSet<Integer> fir = new HashSet<>();
		for (int i =0; i < n; i++) {
			fir.add(Integer.parseInt(nStr[i]));
		}
		// M 배열
		int m = Integer.parseInt(br.readLine());
		String[] mStr = br.readLine().split(" ");
		
		int[] res = new int[m];
		for (int i =0; i < m; i++) {
			int num = Integer.parseInt(mStr[i]);
			if (fir.contains(num)) {
				res[i] = 1;
			} else {
				res[i] = 0;
			}
		}

		for (int i = 0; i < res.length; i++) {
			sb.append(res[i]);
			if (i < res.length - 1) {
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}
}