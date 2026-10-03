import java.util.*;
public class Main{
    public static void main(String[] args){
        String s = "ADOBECODEBANC", t = "ABC";
        int[] record=new int[128];
        for(char c:t.toCharArray()){
            record[c]--;
        }
        int minLen=Integer.MAX_VALUE;
        int count=0;
        int left=0;
        for(int i=0,j=0;i<s.length();i++){
            if(record[s.charAt(i)]<0){
                count++;
            }
            record[s.charAt(i)]++;
            while(record[s.charAt(j)]>0){
                record[s.charAt(j)]--;
                j++;
            }
            if(count==t.length()){
                minLen=Math.min(minLen,i-j+1);
                left=j;
            }
        }
        System.out.println(minLen==Integer.MAX_VALUE?"":s.substring(left,left+minLen));
    }
}


