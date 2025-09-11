//1833. Maximum Ice Cream Bars


class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int cost:costs){
            if(coins-cost>=0){
                count++;
                coins-=cost;
            }
            else{
                break;
            }
        }
        return count;
    }
}
