import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static boolean[][] arr;
	public static int num = 64;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// 배열 입력
		arr = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				if (s.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}

		int row = N - 7;
		int cal = M - 7;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cal; j++) {
				chess(i, j);
			}
		}
		System.out.println(num);
	}

	private static void chess(int x, int y) {
		int xLast = x + 8; 
		int yLast = y + 8;
		int cnt = 0;

		boolean tf = arr[x][y];
		for (int i = x; i < xLast; i++) {
			for (int j = y; j < yLast; j++) {
				if (arr[i][j] != tf) {
					cnt++;
				}
				tf = !tf;
			}
			tf = !tf;
		}

		// 색칠할 칸의 수와 남은 칸의 수를 비교하여 더 작은 수를 저장
		cnt = Math.min(cnt, 64 - cnt);
		// 이전의 값과 비교하여 최솟값을 구함
		num = Math.min(num, cnt);
	}
}