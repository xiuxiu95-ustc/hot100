/**
 * 11. 盛最多水的容器（双指针 - 中等）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（高度数组，空格分隔）
 * 输出：最大盛水量
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

        int result = maxArea(height);
        System.out.println(result);
    }
    private static int maxArea(int[] height) {
        int res=0;
        int i=0,j=height.length-1;
        while(i<j){
            if(height[i]<=height[j]){
                res=Math.max(res,height[i]*(j-i));
                i++;
            }else{
                res=Math.max(res,height[j]*(j-i));
                j--;
            }
        }
        return res;
    }
}
 */