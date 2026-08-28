/**
 * 53. 最大子数组和（动态规划 - 中等）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（空格分隔）
 * 输出：最大子数组和
 */
/*
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums ){
        int res=0;
        int preSum=0;
        for(int num:nums){
            preSum+=num;
            //(1)当count为负时重置
            if(preSum<0){
                preSum=0;
            }
            //(2)更新全局最大值
            res=Math.max(res,preSum);
        }
        return res;
    }
}
 */