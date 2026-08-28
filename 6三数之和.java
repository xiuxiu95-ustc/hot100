/**
 * 15. 三数之和（双指针 - 中等）
 * ACM输入格式：
 * 第1行：数组长度n
 * 第2行：n个整数（空格分隔）
 * 输出：所有和为0的三元组（每组一行，元素空格分隔）
 */
/*import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
        }
    }
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int a=0;a<nums.length;a++){
            if(nums[a]>0){
                break;
            }
            if(a>0 && nums[a]==nums[a-1]){
                continue;
            }
            int b=a+1,c= nums.length-1;
            while(b<c){
                int sum=nums[a]+nums[b]+nums[c];
                if(sum>0){
                    c--;
                }else if (sum<0){
                    b++;
                }else{
                    res.add(Arrays.asList(nums[a],nums[b],nums[c]));
                    b++;
                    c--;
                    while(b<c && nums[b]==nums[b-1]){
                        b++;
                    }
                    while(b<c && nums[c]==nums[c+1]){
                        c--;
                    }

                }

            }

        }
        return res;
    }
}

 */