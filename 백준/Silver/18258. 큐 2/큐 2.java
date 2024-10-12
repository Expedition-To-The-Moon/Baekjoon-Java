import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }

        possible(n, list);
        System.out.println(sb.toString());
    }

    static void possible(int n, String[] list) {
        Deque<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] command = list[i].split(" ");

            switch (command[0]) {
                case "push" :
                    que.offer(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    if (!que.isEmpty()) {
                        sb.append(que.poll()).append('\n');
                    } else {
                        sb.append("-1").append('\n');
                    }
                    break;
                case "size":
                    sb.append(que.size()).append('\n');
                    break;
                case "empty":
                    if (que.isEmpty()) {
                        sb.append("1").append('\n');
                    } else {
                        sb.append("0").append('\n');
                    }
                    break;
                case "front":
                    if (!que.isEmpty()) {
                        sb.append(que.peekFirst()).append('\n');
                    } else {
                        sb.append("-1").append('\n');
                    }
                    break;
                case "back":
                    if (!que.isEmpty()) {
                        sb.append(que.peekLast()).append('\n');
                    } else {
                        sb.append("-1").append('\n');
                    }
                    break;
            }
        }
    }
}