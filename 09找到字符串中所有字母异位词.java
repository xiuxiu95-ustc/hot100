import java.util.*;
public class Main{
    public static void main(String[] args){
        String s = "cbaebabacd", p = "abc";
        List<Integer> res = new ArrayList<>();
        int[] record=new int[26];//int[] result=new int[128];覆盖0~127所有ASCII码，大小写都支持，直接 result[ch]
        for(int i=0;i<p.length();i++){
            record[p.charAt(i)-'a']--;
        }
        for(int i=0,j=0;i<s.length();i++){
            record[s.charAt(i)-'a']++;
            while(record[s.charAt(j)-'a']>0){
                record[s.charAt(j)-'a']--;
                j++;
            }
            if(i-j+1==p.length()){
                res.add(j);
            }
        }
        System.out.println(res);
    }
}


