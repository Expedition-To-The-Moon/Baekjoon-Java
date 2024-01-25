import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while (true) {
            String str = br.readLine();
            if (str.equals(".")){
                break;
            } else {
                boolean res = isBalance(str);
                if (res) {
                    sb.append("yes").append('\n');
                } else {
                    sb.append("no").append('\n');
                }
            }
        }
        System.out.println(sb);
    }

    static boolean isBalance(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
              if (stack.isEmpty()) { return false;  }

              char end = stack.pop();
              if ((ch == ')' && end != '(') || (ch == ']' && end != '[')) { return false; }
            }
        }
        return stack.isEmpty();
    }
}