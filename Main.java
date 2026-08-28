import java.util.*;
public class Main{

    static List<List<String>> res=new ArrayList<>();
    static List<String> path=new ArrayList<>();
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        dfs(s,0);
        System.out.println(res);
    }
    public static void dfs(String s,int startIndex){
        if(startIndex==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<s.length();i++){
            String s1=s.substring(startIndex,i+1);
            if(check(s1)){
                path.add(s1);
                dfs(s,i+1);
                path.removeLast();
            }
            
        }
    }
    public static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    

}

