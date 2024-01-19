import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());

		Deque<Integer> deque = new LinkedList<>();
		int num = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String method = st.nextToken();
			switch (method) {
				case "push_front":
					num = Integer.parseInt(st.nextToken());
					deque.offerFirst(num);
					break;
				case "push_back":
					num = Integer.parseInt(st.nextToken());
					deque.offerLast(num);
					break;
				case "pop_front":
					if (deque.isEmpty()) sb.append(-1).append('\n');
					else sb.append(deque.pollFirst()).append('\n');
					break;
				case "pop_back":
					if (deque.isEmpty()) sb.append(-1).append('\n');
					else sb.append(deque.pollLast()).append('\n');
					break;
				case "size":
					sb.append(deque.size()).append('\n');
					break;
				case "empty":
					if (deque.isEmpty()) sb.append(1).append('\n');
					else sb.append(0).append('\n');
					break;
				case "front":
					if (deque.isEmpty()) sb.append(-1).append('\n');
					else sb.append(deque.peekFirst()).append('\n');
					break;
				default:
					if (deque.isEmpty()) sb.append(-1).append('\n');
					else sb.append(deque.peekLast()).append('\n');
					break;
			}
		}
		System.out.println(sb);
	}
}