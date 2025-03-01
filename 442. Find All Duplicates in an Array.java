//442. Find All Duplicates in an Array


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if((nums[i]^nums[i-1])==0){
                list.add(nums[i]); 
            }
        }
        return list;
    }
}
