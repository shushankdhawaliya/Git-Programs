import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(permuteUnique(arr));
    }
    public  static void backTrack(List<List<Integer>> result,List<Integer> temp,int []nums,boolean  bool[]){
        if(temp.size()==nums.length){
            result.add(new ArrayList(temp));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(bool[i])
                continue;
            if(i>0 && nums[i]==nums[i-1]&&!bool[i-1])
                continue;
            temp.add(nums[i]);
            bool[i] =true;
            backTrack(result,temp,nums,bool);
            temp.remove(temp.size()-1);
            bool[i] = false;
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result =  new ArrayList<>();
        Arrays.sort(nums);
        boolean bool[] =  new boolean[nums.length];
        backTrack(result,new ArrayList<Integer>(),nums,bool);
        return result;
    }
}
