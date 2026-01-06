public class MaxStock {
    public static void main(String[] args){
       int arr[] = {3,2,6,5,0,3};
       System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int sell;
        int buy =sell= prices[0];
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
                sell = prices[i];
            }
            else if(sell<prices[i]){
                sell = prices[i];
                if(profit<sell-buy)
                    profit = sell - buy;
            }            
        }
        if(sell == buy&& profit ==0)
            return 0;
        else
            return profit;
    }
}
