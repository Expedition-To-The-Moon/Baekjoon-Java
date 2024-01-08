import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();

		int aMin = Integer.parseInt(a.replaceAll("6", "5"));
		int bMin = Integer.parseInt(b.replaceAll("6", "5")); 
		int aMax = Integer.parseInt(a.replaceAll("5", "6")); 
		int bMax = Integer.parseInt(b.replaceAll("5", "6")); 

		System.out.print((aMin + bMin) + " " + (aMax + bMax));
	}
}