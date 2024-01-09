import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		ArrayList<Integer> li = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			li.add(i);
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		int idx = 0;
		while (li.size() != 0) {
			idx += (k - 1);
			if (idx >= li.size()) { idx %= li.size(); } 
			
			res.add(li.get(idx));
			li.remove(idx);
		}
		
		sb.append("<");
		for (int i = 0; i < res.size(); i++) {
			sb.append(res.get(i));
			if (i != res.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}