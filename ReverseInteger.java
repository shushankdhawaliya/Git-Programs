public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(reverseInteger(1534236469));
    }
    public static int reverseInteger(int x){
        if(x >=Integer.MAX_VALUE || x<=Integer.MIN_VALUE)
            return 0;
        System.out.println(Integer.MAX_VALUE);
        boolean flag = false;
        if(x< 0){
            x = x-x-x;
            flag = true;
        }
        int sum =0;
        while(x>0){
            int rem = x%10;
            if (sum  > Integer.MAX_VALUE / 10 ||
               (sum == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            sum = rem + sum*10;
            x = x/10;
             
        }
        
        if(flag == true){
            sum = sum -sum -sum;
        }
        return sum;
    }
}