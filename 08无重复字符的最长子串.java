import java.util.*;
public class Main{
    public static void main(String[] args){
        String s="abcabcbb";
        int res=0;
        Set<Character> set=new HashSet<>();
        for(int i=0,j=0;i<s.length();i++){
        //右指针向右扩张，尝试将新字符加入窗口；
        //若新字符已在窗口内，左指针持续向右收缩，直到窗口内无重复字符；
        //每次扩张后更新「最长无重复子串长度」。            
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            res=Math.max(res,i-j+1);
        }       
        System.out.println(res);
    }
}


