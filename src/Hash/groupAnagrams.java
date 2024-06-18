package Hash;

import java.util.*;

/**
 * @Author yyzhou
 * @Date 2024/6/18 10:14
 * @PackageName:Hash
 * @ClassName: groupAnagrams
 * @Description: TODO
 * @Version 1.0
 */
public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs) {
            System.out.println(s);
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            System.out.println(chars);
            String key=new String(chars);

            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String strs[] = new String[7];
        strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams ga =new groupAnagrams();
        List<List<String>> lists = ga.groupAnagrams(strs);
        System.out.println(lists);
    }

}



