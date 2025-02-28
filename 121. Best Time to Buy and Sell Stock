//121. Best Time to Buy and Sell Stock


import java.util.*;
class Solution {
    public int maxProfit(int[] a) {
        int min =a[0];        
        int prof=0;
        for(int i=0;i<a.length;i++){
            min=Math.min(min,a[i]);
            prof=Math.max(prof,a[i]-min);
        }
        return prof;
    }
}
