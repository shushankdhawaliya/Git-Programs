public class PlusOne {
       public static void main(String[] args) {
         int arr[] ={9,9,9,9};
         int arr2[]  = plusOne(arr);
         for(int i : arr2)
         System.out.println(i);
       }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[0]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int arr2[] = new int[digits.length+1];
        arr2[0]=1;
        return arr2;
    }
}
