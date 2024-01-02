import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());

		// 중복 제거
		HashSet<String> arr = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			arr.add(str);
		}

		// 배열 정렬
		ArrayList<String> arr2 = new ArrayList<>();
		for (String s : arr) {
			arr2.add(s);
		}
		Collections.sort(arr2, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.length() == b.length()) {
					return a.compareTo(b);
				} else {
					return a.length() - b.length();
				}
			} 
		});
        
		for (String s : arr2) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}
}