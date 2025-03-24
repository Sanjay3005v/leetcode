//1470. Shuffle the Array


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] sol = new int[nums.length];
        int i=0;
        int j=n;
        int index=0;
        while(index<nums.length){
            sol[index++]=nums[i++];
            sol[index++]=nums[j++];
        }
        return sol;
    }
}
