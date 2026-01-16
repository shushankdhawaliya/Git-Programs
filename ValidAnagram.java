import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        if(s_len!=t_len)
            return false;
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i=0;
        while(i<s_len){
            if(ch1[i]!=ch2[i])
                return false;
            i++;
        }
        return true;
    }
}
