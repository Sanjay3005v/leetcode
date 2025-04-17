//122. Best Time to Buy and Sell Stock II


class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];        
        int prof=0;
        for(int i=0;i<prices.length;i++){
            if(min<prices[i]){
                prof+=prices[i]-min;
            }
            min=prices[i];
        }
        return prof;
    }
}
