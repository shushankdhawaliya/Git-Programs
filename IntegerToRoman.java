public class IntegerToRoman {
    public static void main(String []args){
        System.out.println(integerToRoman(3349));
    }
    public static String integerToRoman(int num){
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbol[] = {"M","CM","D","CD","C","XC","L","XL","x","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();
        for(int i=0;i<values.length; i++){
            while(num>=values[i]){
                num -=values[i];
                result.append(symbol[i]);
            }
        }
        return result.toString();
    }
}
