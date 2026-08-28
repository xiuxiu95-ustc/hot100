/**
 * 438. 找到字符串中所有字母异位词（滑动窗口 - 中等）
 * ACM输入格式：
 * 第1行：字符串s
 * 第2行：字符串p
 * 输出：所有异位词的起始索引（空格分隔）
 */
/*
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();

        System.out.println(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s,String p){
        int[] result=new int[128];//仅考虑小写字母时，可以：  int[] result=new int[26];  然后后边对应的是result[ch-'a']
        for(char ch:p.toCharArray()){
            result[ch]--;
        }
        List<Integer> res=new ArrayList<>();
        for(int left=0,right=0;right<s.length();right++){
            record[s.charAt(right)]++;
            while(record[s.charAt(left)]>0){
                record[s.charAt(left)]--;
                left++;
            }
            if(right-left+1==p.length()){
                res.add(left);
            }
        }
        return res;
    }
}
 */