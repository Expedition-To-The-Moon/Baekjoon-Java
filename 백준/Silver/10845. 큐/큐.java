import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<>();
		int end = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String method = st.nextToken();
			switch (method) {
				case "push":
					end = Integer.parseInt(st.nextToken());
					queue.offer(end);
					break;
				case "pop":
					if (queue.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(queue.poll()).append('\n');
					}
					break;
				case "size":
					sb.append(queue.size()).append('\n');
					break;
				case "empty":
					if (queue.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
				case "front":
					if (queue.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(queue.peek()).append('\n');
					}
					break;
				default:
					if (queue.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(end).append('\n');
					}
					break;
			}
		}
		System.out.println(sb);
	}
}