import java.util.*;
public class Main{
    public static void main(String[] args){
        int[]nums={0,1,0,3,12};
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i>j){
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}


