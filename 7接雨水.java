/**
 * 42. 接雨水（双指针 - 困难）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（高度数组，空格分隔）
 * 输出：能接的雨水量
 */
/*
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = trap(height);
        System.out.println(result);
    }
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1; // 左右指针从两端向中间走
        int leftMax = 0, rightMax = 0; // 左指针左侧的最大高度、右指针右侧的最大高度
        int res = 0;

        while (left < right) {
            // 核心：接水量由「较低的一侧」决定（木桶效应）
            if (height[left] < height[right]) {
                // 左指针侧更低，计算left列的接水量
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // 更新左最大高度（当前列是新的左最大，无法接水）
                } else {
                    res += leftMax - height[left]; // 能接的水量=左最大 - 当前列高度
                }
                left++; // 左指针右移
            } else {
                // 右指针侧更低，计算right列的接水量
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // 更新右最大高度
                } else {
                    res += rightMax - height[right]; // 能接的水量=右最大 - 当前列高度
                }
                right--; // 右指针左移
            }
        }
        return res;
    }
}
 */
