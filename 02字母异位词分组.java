import java.util.*;
public class Main{
    public static void main(String[] args){
        List<List<String>> res=new ArrayList<>();
        String[] str={"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,List<String>> map=new HashMap<>();
        for(String s:str){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);//不是toString
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);

        }
        res.addAll(map.values());
        System.out.println(res);

    }
}


