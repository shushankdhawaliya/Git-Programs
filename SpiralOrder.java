import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int  n  = matrix.length;
        int m = matrix[0].length;
         int rowStart = 0;
        int rowEnd =n-1;
        int colStart = 0;
        int colEnd = m-1;
        List <Integer> list = new ArrayList<>();

        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i= colStart;i<=colEnd;i++){
                list.add(matrix[colStart][i]);
            }
            rowStart++;
             for(int i=rowStart;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
             }
             colEnd--;
             for(int i=colEnd;i>=colStart;i--){
                if(rowStart<=rowEnd){
                    list.add(matrix[rowEnd][i]);
                }
             }
             rowEnd--;
             for(int i=rowEnd;i>=rowStart;i--){
                if(colStart<=colEnd){
                    list.add(matrix[i][colStart]);
                }
             }
             colStart++;
        }
        return  list;
    }
}
