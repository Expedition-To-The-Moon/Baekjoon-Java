import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int t = Integer.parseInt(br.readLine());

		boolean[] res = new boolean[t];
		for (int i = 0; i < t; i++) {
			res[i] = vps(br.readLine());
		}

		for (int i = 0; i < res.length; i++) {
			if (res[i]) {
				sb.append("YES");
			} else {
				sb.append("NO");
			}

			if (i != res.length - 1) {
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}

	public static boolean vps(String P) {
		LinkedList<Character> stack = new LinkedList<>();
		for (char ps : P.toCharArray()) {
			if (ps == '(') {
				stack.push(ps);
			} else if (stack.isEmpty()) {
				return false;
			} else {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}