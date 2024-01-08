import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());

		ArrayList<Pair> coord = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			coord.add(new Pair(x, y));
		}
		Collections.sort(coord);

		for (Pair p : coord) {
			int x = p.x;
			int y = p.y;
			sb.append(x).append(" ").append(y).append('\n');
		}
		System.out.println(sb);
	}
}

class Pair implements Comparable<Pair> {
	int x, y;

	public Pair(int x, int y) {
		 this.x = x;
		 this.y = y;
	}

	public int compareTo(Pair o) {
		if (o.x != this.x) {
			return this.x - o.x;
		} else {
			return this.y - o.y;
		}
	}
}