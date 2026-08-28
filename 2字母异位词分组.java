/**
 * 49. 字母异位词分组（哈希 - 中等）
 * ACM输入格式：
 * 第1行：字符串数组长度n
 * 第2行：n个字符串（空格分隔）
 * 输出：分组后的字母异位词（每组一行，元素空格分隔）
 */
/*

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = sc.nextLine().split(" ");

        List<List<String>> result = groupAnagrams(strs);
        for (List<String> group : result) {
            // 组内字符串用空格拼接，输出一行
            System.out.println(String.join(" ", group));
        }
    }
    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            //一行完成 “获取列表（无则创建）+ 添加元素
            //List<String> list=map.getOrDefault(key,new ArrayList<>());
            //list.add(str);
            //map.put(key,list);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<> (map.values());
    }
}
 */