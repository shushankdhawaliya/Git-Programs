import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,5,0,0,0,0};
        int arr2[] = {3,4,5,6};
        merge(arr1,4,arr2,4);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            System.out.println(nums1[0]);
        }
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i] = nums2[j++];
        }
           Arrays.sort(nums1);
        for(int i: nums1){
            System.out.println(i);
        }
    }
}
