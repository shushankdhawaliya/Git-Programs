import java.util.Arrays;

public class movesZeroes {
    public static void main(String[] args) {
        int arr[]={0,2,0,12,16};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums){
        int k=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[k]=nums[j];
                k++;
            }
        }
        while(k<nums.length){
                nums[k]=0;
                k++;
            }
        for(int j:nums)
            System.out.println(j);
    }
}
