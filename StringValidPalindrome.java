public class StringValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s.isEmpty()||s.contains(null))
            return true;
      String st =s.toLowerCase();  
      String st2 = st.replace(" ","");
      int last = st2.length()-1;
      int start = 0;
      while(start<last){
        char ch = st2.charAt(start);
        char ch2 = st2.charAt(last);

        if(!Character.isLetterOrDigit(ch2)){
            last--;
        }
        else if(!Character.isLetterOrDigit(ch)){
            start++;
        }
        else{
            if(ch!=ch2)
                return false;
            start++;
            last--;
        }

      }
        return true;
    }
}
