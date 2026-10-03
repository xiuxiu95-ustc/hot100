import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] nums={1,1,1};
        int target=2;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int res=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-target)){
                res+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(res);
    }
}


