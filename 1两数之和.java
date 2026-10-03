import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] nums=new int[]{2,7,11,15};
        int  target=9;
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res=new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        System.out.println(Arrays.toString(res));
    }
}
