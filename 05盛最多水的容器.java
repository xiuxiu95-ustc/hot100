import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] heights={1,8,6,2,5,4,8,3,7};
        int res=0;
        int i=0, j=heights.length-1;
        while(i<j){
            if(heights[i]<heights[j]){
                res=Math.max(res,heights[i]*(j-i));
                i++;
            } else {
                res=Math.max(res, heights[j]*(j-i));
                j--;
            }
        }
        System.out.println(res);
    }
}


