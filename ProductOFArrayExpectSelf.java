public class ProductOFArrayExpectSelf {
    public static void main(String[] args) {
        int arr2[] = {1,2,3,4};
        int temp[] =productExceptSelf(arr2);
        for(int i: temp){
            System.out.print(i+", ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]arr = new int[n];
        arr[0] = nums[0];
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1]*nums[i-1];
        }
        int temp = 1;
        for(int i=n-1;i>=0;i--){
            arr[i]=  arr[i]*temp;
            temp = temp * nums[i];
            
        }
        return arr;
    }
}