//3375. Minimum Operations to Make Array Values Equal to K


class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(num<k){
                return -1;
            }
            else if(num>k){
                set.add(num);
            }
        }
        return set.size();
    }
}
