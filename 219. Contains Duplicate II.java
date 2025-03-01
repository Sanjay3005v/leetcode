//219. Contains Duplicate II


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                int prev=a.get(nums[i]);
                if(Math.abs(i-prev)<=k)
                    return true;
            }
            a.put(nums[i],i);
        }
        return false;
    }
}
