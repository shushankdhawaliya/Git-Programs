 public class binaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }
    public static int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int max  =0;
        int prefix = -1;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){ 
                if(prefix!=-1){
                    max =  Math.max(max, i-prefix);
                }
                 prefix  =i;
            }
           
        }
        return  max;
    }
 }