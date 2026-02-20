public class CountDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
    public static char findTheDifference(String s, String t) {
       char sum =0;
        for(char ch :t.toCharArray()){
            sum+=ch;
        }
        for(char ch : s.toCharArray()){
            sum-=ch;
        }
        return (char)sum;
    }
}
