//229. Majority Element II


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> list = new HashSet<>();
        int temp =nums[0];
        for(int i=0;i<nums.length;i++){
            int count =1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/3){
                list.add(nums[i]);
            }
        }
        ArrayList<Integer> sol = new ArrayList<>(list);

    return sol;
    }
}
