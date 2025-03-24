//260. Single Number III


class Solution {
    public int[] singleNumber(int[] nums) {
        int[] sol =new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int index=0;
        for(Map.Entry<Integer,Integer> val:map.entrySet()){
            if(val.getValue()!=2){
                sol[index++]=val.getKey();
            }
        }
        return sol;
    }
}
