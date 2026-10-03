import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] nums={-1,0,1,2,-1,-4};
        List<int[]> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int a=0;a<nums.length;a++){
            while(a>0 && nums[a]==nums[a-1]){
                a++;//while对应a++，if对应continue
            }
            int b=a+1,c=nums.length-1;
            while(b<c){
                int sum=nums[a]+nums[b]+nums[c];
                if(sum>0){
                    c--;
                }else if(sum<0){
                    b++;
                }else{
                    res.add(new int[]{nums[a], nums[b], nums[c]});
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
        for(int[] row : res){
            System.out.println(Arrays.toString(row));
        }
    }
}


