//1567. Maximum Length of Subarray With Positive Product


class Solution {
    public int getMaxLen(int[] nums) {
        int pos=0;
        int neg=0;
        int max=0;
        for(int i:nums){
            if(i==0){
                pos=0;
                neg=0;
                continue;
            }
            pos++;
            neg= neg>0 ?neg+1:0;
            if(i<0){
                int temp = pos;
                pos=neg;
                neg=temp;
            }
            max=Math.max(max,pos);
        }
        return max;
    }
}
