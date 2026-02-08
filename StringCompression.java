public class StringCompression {
    public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int len = chars.length;
        if(len==0)
            return 0;
        int i=0;
        int index = 0;
        while(i<len){
            char ch = chars[i];
            int size =0;
            while(i<len&&ch==chars[i]){
                i++;
                size++;
            }
            chars[index++] =ch;
            if(size>1){
                for(char c : String.valueOf(size).toCharArray()){
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
