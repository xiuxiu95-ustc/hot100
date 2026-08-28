
/**
 * 1. 两数之和（哈希 - 简单）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（空格分隔）
 * 第3行：目标值target
 * 输出：两个下标（空格分隔，从0开始）
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

        int target = sc.nextInt();

        sc.nextLine(); // 吸收换行符

        int[] result = twoSum(nums, target);

        System.out.println(result[0]+" "+ result[1]);
    }
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
 */