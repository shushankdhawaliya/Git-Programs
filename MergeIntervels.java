import java.util.Arrays;

public class MergeIntervels {
    public static void main(String[] args) {
        int intervals[][] ={{1,3},{2,6},{8,10},{15,18}};
        int arr2[][] = merge(intervals);
        for(int i =0;i<arr2.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr2[i][j]+", ");
            }
        }
    }
     public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] temp = new int[intervals.length][2];
        int k = 0;
        temp[0][0] = intervals[0][0];
        temp[0][1] = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= temp[k][1]) {
                temp[k][1] = Math.max(temp[k][1], intervals[i][1]);
            }
            else {
                k++;
                temp[k][0] = intervals[i][0];
                temp[k][1] = intervals[i][1];
            }
        }
        return Arrays.copyOf(temp, k + 1);
    }
}
