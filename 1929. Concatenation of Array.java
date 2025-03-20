//1929. Concatenation of Array


class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] sol = new int[nums.length*2];
        for(int i=0;i<sol.length;i++){
            sol[i]=nums[i%nums.length];
        }
        return sol;
    }
}
