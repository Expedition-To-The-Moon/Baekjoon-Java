import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        avg();
        median();
        mode();
        scope();
    }

    static void avg() {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println((int) Math.round(sum / nums.length));
    }

    static void median() {
        int idx = nums.length / 2;
        System.out.println(nums[idx]);
    }

    static void mode() {
        int[] modeNum = new int[80001];
        for (int i : nums) {
            modeNum[i + 4000]++;
        }
        int max = Arrays.stream(modeNum).max().getAsInt();

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < modeNum.length; i++) {
            if (modeNum[i] == max) {
                num.add(i - 4000);
            }
        }
        if (num.size() == 1) {
            System.out.println(num.get(0));
        } else {
            System.out.println(num.get(1));
        }
    }

    static void scope() {
        if (nums.length == 1) {
            System.out.println(0);
        } else {
            int min = nums[0];
            int max = nums[nums.length - 1];
            System.out.println(max - min);
        }
    }
}
