import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int arr[] = {-13,-4,-1,0,2,3,56,88};
        int temp[] = sortedSquares(arr);
        for(int i: temp){
            System.out.println(i+" ");
        }
    }
    public static int[] sortedSquares(int nums[]){
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
