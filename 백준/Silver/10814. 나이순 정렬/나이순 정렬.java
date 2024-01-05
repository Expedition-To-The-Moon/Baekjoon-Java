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

		ArrayList<Pair> li = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			li.add(new Pair(n, s));
		}
		Collections.sort(li);

		for (Pair p : li) {
			int n = p.n;
			String s = p.s;
			System.out.println(n + " " + s);
		}
	}
}

class Pair implements Comparable<Pair> {
	int n;
	String s;

	public Pair(int n, String s) {
		 this.n = n;
		 this.s = s;
	}

	public int compareTo(Pair o) {
		return this.n - o.n;
	}
}