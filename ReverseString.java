public class ReverseString {
    public static void main(String[] args) {
        char c[] = {'a','p','p','l','e'};
        System.out.println(reverseString(c));
    }
    public static char[] reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char ch = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = ch;
        }
        return s;
    }
}
