//137. Single Number II


class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> val:map.entrySet()){
            if(val.getValue()!=3){
                return val.getKey();
            }
        }
        return -1;
    }
}
