public class RotateImage {
    public static void main(String [] args){
        int arr[][]  = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = rotate(arr);
        for(int i=0;i<arr2.length;i++){
            for(int j =0;j<arr2[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;
    }
}