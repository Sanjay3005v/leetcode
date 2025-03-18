//448. Find All Numbers Disappeared in an Array


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>(2);
        int[] freq = new int[nums.length+1];
        for(int i:nums){
            freq[i]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]<=0){
                list.add(i);
            }
        }
        return list;
    }
}
