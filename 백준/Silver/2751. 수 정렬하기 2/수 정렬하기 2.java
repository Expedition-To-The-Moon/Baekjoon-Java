import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> li = new ArrayList<>(); 
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			li.add(n);
		}
		Collections.sort(li);

		for (int i : li) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}