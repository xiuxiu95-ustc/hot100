/**
 * 560. 和为K的子数组（滑动窗口/前缀和 - 中等）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（空格分隔）
 * 第3行：目标值k
 * 输出：和为k的子数组个数
 */
/*
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(subarraySum(nums, k));
    }

    private static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        int preSum = 0, count = 0;

        for (int num : nums) {
            preSum += num;
            if (preSumMap.containsKey(preSum - k)) {
                count += preSumMap.get(preSum - k);
            }
            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
 */
