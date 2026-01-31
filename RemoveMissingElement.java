public class RemoveMissingElement {
    public static void main(String[] args) {
     int arr[] = {1,2,0,4,5};
     System.out.println(missingNumber(arr)); 
    }
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int mainsum = (len*(len+1))/2;
        int sum = 0;
        for(int i=0;i<len;i++)
            sum += nums[i];
        return mainsum-sum;
    }
}
