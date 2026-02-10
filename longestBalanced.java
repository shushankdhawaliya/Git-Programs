import java.util.HashMap;
import java.util.Map;

public class longestBalanced {
    public static void main(String[] args) {
        int array[] = {1,3,4,5,6,7};
        System.out.println(longestBalancedArray(array));
    }
    public static int longestBalancedArray(int[] nums) {
    int n = nums.length;
    int maxLen = 0;

    for (int left = 0; left < n; left++) {
        Map<Integer, Integer> evenFreq = new HashMap<>();
        Map<Integer, Integer> oddFreq = new HashMap<>();
        int distinctEven = 0;
        int distinctOdd = 0;

        for (int right = left; right < n; right++) {
            int num = nums[right];

            if (num % 2 == 0) {
                evenFreq.put(num, evenFreq.getOrDefault(num, 0) + 1);
                if (evenFreq.get(num) == 1) distinctEven++;
            } else {
                oddFreq.put(num, oddFreq.getOrDefault(num, 0) + 1);
                if (oddFreq.get(num) == 1) distinctOdd++;
            }

            if (distinctEven == distinctOdd) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
    }

    return maxLen;
}
}