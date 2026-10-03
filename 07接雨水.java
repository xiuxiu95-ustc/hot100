import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] heights={0,1,0,2,1,0,1,3,2,1,2,1};
        int res=0;
        int left=0,right=heights.length-1;
        int leftMax=0,rightMax=0;
        while(left<right){
            if(heights[left]<heights[right]){
                if(heights[left]>=leftMax){
                    leftMax=heights[left];
                }else{
                    res+=leftMax-heights[left];
                }
                left++;
            }else{
                if(heights[right]>=rightMax){
                    rightMax=heights[right];
                }else{
                    res+=rightMax-heights[right];
                }
                right--;
            }
        }
        System.out.println(res);
    }
}


