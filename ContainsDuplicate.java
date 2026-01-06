import java.util.HashSet;
    class Solution {
        public static void main(String[] args) {
            int nums[] = {1,2,3,1};
            System.out.println(containsDuplicate(nums));
        }
    public static boolean containsDuplicate(int[] nums) {
     HashSet<Integer> map = new HashSet<>();
     map.add(nums[0]);
     for(int i=1;i<nums.length;i++){
        if(map.contains(nums[i])){
            return true;
        }
        map.add(nums[i]);
     }
     return false;
    }
}
