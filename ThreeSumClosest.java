import java.util.Arrays;

public class ThreeSumClosest {
public static void main(String[] args) {
    int nums[] = {-1,2,1,4};
    System.out.println(threeSumClosest(nums,1));
}
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closest sum if current is closer to target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // Exact match found
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
}