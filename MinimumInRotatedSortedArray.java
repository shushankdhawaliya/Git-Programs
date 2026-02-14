public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {33,45,67,1,3};
        System.out.println(findMin(arr));
    }
        public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
