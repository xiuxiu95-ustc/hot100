/**
 * 128. 最长连续序列（哈希 - 中等）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（空格分隔）
 * 输出：最长连续序列的长度
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

        int result = longestConsecutive(nums);
        System.out.println(result);
    }
    private static int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int streakSum=0;
        int res=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curnum=num;
                streakSum=1;
                while(set.contains(curnum+1)){
                    curnum++;
                    streakSum++;
                }
            }
            res=Math.max(res,streakSum);
        }
        return res;
    }
}
 */
