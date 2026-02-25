import java.util.Arrays;

public class sortByBits {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        System.out.println(sortByBits(arr));
    }
    public static int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxed, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            
            if (countA == countB) {
                return a - b; 
            }
            return countA - countB;  
        });
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray(); 
    }
}
