public class SpiralMatrix {
    public static void main(String[] args) {
        int arr2[][] = new SpiralMatrix().generateMatrix(3);
           for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(arr2[i][j]+", ");
            }
            System.out.println();
           }
    }
         public int[][] generateMatrix(int n) {
        int rowStart = 0;
        int rowEnd =n-1;
        int colStart = 0;
        int colEnd = n-1;
        int arr[][] = new int[n][n];
        int num = 1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i= colStart;i<=colEnd;i++){
                arr[colStart][i]= num++;
            }
            rowStart++;
             for(int i=rowStart;i<=rowEnd;i++){
                arr[i][colEnd]=num++;
             }
             colEnd--;
             for(int i=colEnd;i>=colStart;i--){
                if(rowStart<=rowEnd){
                    arr[rowEnd][i]=num++;
                }
             }
             rowEnd--;
             for(int i=rowEnd;i>=rowStart;i--){
                if(colStart<=colEnd){
                    arr[i][colStart]=num++;
                }
             }
             colStart++;
        }
        return  arr;
     }
}
