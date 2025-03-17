//905. Sort Array By Parity



class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int index=0;
        for(int i:nums){
            if(i%2==0){
                arr[index]=i;
                index++;
            }
        }
        for(int i:nums){
            if(i%2!=0){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
}
