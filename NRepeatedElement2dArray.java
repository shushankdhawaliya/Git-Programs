import java.util.HashSet;

public class NRepeatedElement2dArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,3};
        System.out.println(repeatedNTimes(arr));
    }
    public static int repeatedNTimes(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int n : nums){
            if(hs.contains(n))
                return n;
            hs.add(n);
        }
        return 0;
    }
}
