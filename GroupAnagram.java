import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public static void main(String[] args) {
        String str[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String st = ch.toString();
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(str);
        }
        return new ArrayList<>(map.values());
    }
}