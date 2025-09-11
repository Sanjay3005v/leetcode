//2149. Rearrange Array Elements by Sign


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos =0;
        int neg =1;
        int[] sol = new int[nums.length];
        for(int num:nums){
            if(num>0){
                sol[pos]=num;
                pos+=2;
            }
            else{
                sol[neg]=num;
                neg+=2;
            }
        }
        return sol;
    }
}
