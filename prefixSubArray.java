public class prefixSubArray {
    public static void main(String[] args) {
        int arr[ ] = {1,2,3,4,5,2,5,6};
        System.out.println(minimumPrefixLength(arr));
    }
    public static int minimumPrefixLength(int[] nums) {
        int len = nums.length;
        if(len==0|| len ==1){
            return 0;
        }
        int preFix = 0;
        for(int i=0;i<len-1;i++){        
            if(nums[i]>=nums[i+1]){
             preFix=i+1;   
            }   
        }
        return preFix;
    }
}
