//2610. Convert an Array Into a 2D Array With Conditions



class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[nums.length+1];
        List<List<Integer>> list  = new ArrayList<>();
        for(int num:nums){
            if(count[num]>=list.size()){
                list.add(new ArrayList<>());
            }
            list.get(count[num]).add(num);
            count[num]++;
        }
        return list;
    }
}
