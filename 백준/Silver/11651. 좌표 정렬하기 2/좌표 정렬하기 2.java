import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());

		int[][] data = new int[n][2];
		for (int i = 0; i < n; i++) { 
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		data = coordinates(data);

		for (int[] dot : data) {
			sb.append(dot[0]).append(" ").append(dot[1]).append("\n");
		}
		System.out.println(sb);
	}

	static int[][] coordinates(int[][] data){
		Arrays.sort(data, (a, b) -> {
			if (a[1] == b[1]) {
				return a[0] - b[0];
			}
			return a[1] - b[1];
		});
		return data;
	}
}