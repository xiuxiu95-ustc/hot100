import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        Deque<Integer> de=new ArrayDeque<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             // 移除超出窗口的元素索引
            while(!de.isEmpty() && i-de.peekFirst()+1>k){
                de.pollFirst();
            }
            //// 维护单调队列（从大到小）
            while(!de.isEmpty() && nums[i]>nums[de.peekLast()]){    
                de.pollLast();
            }
            de.addLast(i);
            if(i-k+1>=0){
                res.add(nums[de.peekFirst()]);
            }
        }
        System.out.println(res);
    }
}


