import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		String[] nCard = br.readLine().split(" ");

		HashMap<Integer, Integer> cards = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(nCard[i]);
			cards.put(num, cards.getOrDefault(num, 0) + 1);
		}

		int m = Integer.parseInt(br.readLine());
		String[] mCard = br.readLine().split(" ");

		int[] res = new int[m];
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(mCard[i]);
			res[i] = cards.getOrDefault(num, 0);
		}

		for (int i : res) {
			sb.append(i).append(' ');
		}
		System.out.println(sb);
	}
}