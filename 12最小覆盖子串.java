/**
 * 76. 最小覆盖子串（滑动窗口 - 困难）
 * ACM输入格式：
 * 第1行：字符串s
 * 第2行：字符串t
 * 输出：s中覆盖t所有字符的最小子串
 */
/*
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        //System.out.println(minWindow(s,t));
        System.out.println("读取到的s：" + s);
        System.out.println("读取到的t：" + t);
        System.out.println("最小覆盖子串：" + minWindow(s,t));
    }
    public static String minWindow(String s,String t){
        int[] result=new int[128];
        //char 类型作为数组索引时，会自动转换为该字符对应的 Unicode 编码值（int 类型）,对于 ASCII 字符:0-127

        for(int i=0;i<t.length();i++){
            result[t.charAt(i)]--;
        }
        int left=-1;
        int count=0;
        int minLength=s.length()+1;
        for(int i=0,j=0;j<s.length();j++){
            if(result[s.charAt(j)]<0){
                count++;
            }
            result[s.charAt(j)]++;
            while(i<j && result[s.charAt(i)]>0){
                result[s.charAt(i)]--;
                i++;
            }

            if(count==t.length() && j-i+1<minLength){
                minLength=j-i+1;
                left=i;
            }
        }
        return left==-1? "":s.substring(left,left+minLength);
    }
}
 */