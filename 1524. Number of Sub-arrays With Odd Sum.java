//1524. Number of Sub-arrays With Odd Sum


class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount=0;
        long sum=0;
        for(int i:arr){
            sum+=i;
            oddCount+=sum%2;
        }
        oddCount +=(arr.length-oddCount)*oddCount;
        return (int)(oddCount%1000000007);
    }
}
