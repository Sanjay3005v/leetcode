//1. Two Sum



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                sol[0]=i;
                sol[1]=map.get(diff);
                break;
            }
            map.put(nums[i],i);
        }
        return sol;
    }
}
