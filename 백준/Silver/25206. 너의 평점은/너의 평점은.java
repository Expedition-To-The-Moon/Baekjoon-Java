import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] levels = {"F", " ", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"};
        double[] scores = new double[20];
        String[] subjectScore = new String[20];

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            scores[i] = Double.parseDouble(st.nextToken());
            subjectScore[i] = st.nextToken();
        }

        double totalSum = 0;
        double totalGrade = 0;
        for (int i = 0; i < 20; i++) {
            if (!subjectScore[i].equals("P")) {
                totalSum += scores[i];

                for (int j = 0; j < levels.length; j++) {
                    if (subjectScore[i].equals(levels[j])) {
                        totalGrade += (scores[i] * (j * 0.5));
                    }
                }
            }
        }

        System.out.printf("%.6f", totalGrade / totalSum);
    }
}
