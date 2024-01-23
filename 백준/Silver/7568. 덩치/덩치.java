import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());

		int[][] person = new int[n][2];
		for(int i = 0; i < person.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			person[i][0] = Integer.parseInt(st.nextToken());
			person[i][1] = Integer.parseInt(st.nextToken());
		}
		int[] score = Persons(person); 
		for (int i : score) {
			sb.append(i + 1).append(" ");
		}
		System.out.println(sb);
	}

	static int[] Persons(int[][] person) {
		int[] score = new int[person.length];
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
					score[i]++;
				} else if (person[i][0] > person[j][0] && person[i][1] > person[j][1]){
					score[j]++;
				}
			}
		}
		return score;
	}
}