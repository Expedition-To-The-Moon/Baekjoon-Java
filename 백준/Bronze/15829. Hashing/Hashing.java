import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        long res = 0;
        for (int i = 0; i < L; i++) {
            long alp = (long)s.charAt(i) - 'a';
            long p = (long)Math.pow(31, i);
            res += (alp + 1) * p;
        }
        System.out.println(res);
    }
}