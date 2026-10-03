import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<0){
                sum=0;
            }
            res=Math.max(res,sum);
        }
        System.out.println(res);
    }
}


