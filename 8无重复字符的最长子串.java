/**
 * 3. 无重复字符的最长子串（滑动窗口 - 中等）
 * ACM输入格式：
 * 第1行：输入一个字符串
 * 输出：最长无重复字符子串的长度
 */
/*
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        //右指针向右扩张，尝试将新字符加入窗口；
        //若新字符已在窗口内，左指针持续向右收缩，直到窗口内无重复字符；
        //每次扩张后更新「最长无重复子串长度」。
        int maxLength=0;
        Set<Character> set=new HashSet<>();
        for(int left=0,right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
 */