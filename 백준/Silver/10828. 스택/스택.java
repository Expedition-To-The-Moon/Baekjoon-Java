import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());

		LinkedList<Integer> stack = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String method = st.nextToken();
			switch (method) {
				case "push":
					int x = Integer.parseInt(st.nextToken());
					stack.push(x);
					break;
				case "pop":
					if(stack.isEmpty()){
						sb.append(-1).append('\n');
					} else {
						sb.append(stack.pop()).append('\n');
					}
					break;
				case "size":
					sb.append(stack.size()).append('\n');
					break;		
				case "empty":
					if (stack.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
				default:
					if (stack.isEmpty()){
						sb.append(-1).append('\n');
					} else {
						sb.append(stack.peek()).append('\n');
					}
					break;
			}
		}
		System.out.println(sb);
	}
}