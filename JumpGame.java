public class JumpGame {
    public static void main(String[] args) {
        int arr[] = {3,0,0,0};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(max<i)
               return false;
            max = Math.max(max,i+nums[i]);
        }
        System.out.println(max);
        if(nums.length-1<=max)
            return true;
        else
            return false;
    }
}
