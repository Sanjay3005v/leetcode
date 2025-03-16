//2594. Minimum Time to Repair Cars


class Solution {
    public long repairCars(int[] ranks, int cars) {
        int min=ranks[0],max=ranks[0];
        for(int i:ranks){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int[] freq = new int[max+1];
        for(int i:ranks){
            freq[i]++;
        }
        long left=1,right=1L*min*cars*cars;
        while(left<=right){
            long mid=(left+right)/2;
            long count=0;
            for(int i=1;i<=max;i++){
                count+=freq[i]*(long)Math.sqrt(mid/(long)i);
            }
            if(count>=cars){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
