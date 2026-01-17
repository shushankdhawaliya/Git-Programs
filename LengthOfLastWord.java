public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
public static int lengthOfLastWord(String s) {
        int len =0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }
            if(len>0&&s.charAt(i)==' '){
                return len;
            }
        }
        return len;
    }
}
