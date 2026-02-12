public class sqrtFunction {
    public static void main(String[] args) {
        System.out.println(mySqrt(15));
    }
    public static int mySqrt(int x) {
    if (x < 2)
        return x;
    int low = 1;
    int high = x / 2;
    int ans = 0;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (mid <= x / mid) {
            ans = mid;         
            low = mid + 1;      
        } else {
            high = mid - 1;     
        }
    }
    return ans;
}
}