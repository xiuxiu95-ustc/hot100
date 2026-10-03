import java.util.*;
public class Main{
    public static void main(String[] args){
        int[]nums={100,4,200,1,3,2};
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int res=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int cur=num;
                int count=1;
                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }
                res=Math.max(res,count);
            }
        }
        System.out.println(res);

    }
}


