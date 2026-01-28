public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(3443));
    }
    public static int mySqrt(int x) {
        int low =0;
        int high = x;
        int result =  0;
        while(low<high){
            int mid = high+low/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid>x){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return  result;
    }
}
