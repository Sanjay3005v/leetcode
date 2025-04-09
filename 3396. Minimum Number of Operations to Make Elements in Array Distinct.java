//3396. Minimum Number of Operations to Make Elements in Array Distinct


class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] arr = new boolean[128];
        for(int i=nums.length-1;i>=0;i--){
            if(arr[nums[i]]){
                return i/3+1;
            }
            arr[nums[i]]=true;
        }
        return 0;
    }
}
