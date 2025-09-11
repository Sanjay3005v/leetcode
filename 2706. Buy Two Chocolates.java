//2706. Buy Two Chocolates


class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num:prices){
            if(min1>num){
                min2 = min1;
                min1 = num;
            }
            else{
                min2 = Math.min(min2,num);
            }
        }
        if((money-min1-min2)<0){
            return money;
        }
        return (money-min1-min2);
    }
}
