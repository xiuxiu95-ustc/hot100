/**
 * 283. 移动零（双指针 - 简单）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（空格分隔）
 * 输出：移动零后的数组（空格分隔）
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

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    private static void moveZeroes(int[] nums) {
        //j快指针，快元素不是0就移动，快慢不同位就换值
        for(int i=0,j=0;j<nums.length;j++){
            if(nums[j]!=0){
                if(i<j){
                    nums[i]=nums[j];
                    nums[j]=0;
                }
                i++;
            }
        }
    }
}
 */
