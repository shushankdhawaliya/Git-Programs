public class FirstOccuranceInString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int first = strStr(haystack,needle);
        System.out.println(first);
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0 )
            return 0;
        if(needle.length()> haystack.length())
        return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
             int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
                if(j==needle.length()){
                    return i;
                }
            }
        return -1;
    }
}
