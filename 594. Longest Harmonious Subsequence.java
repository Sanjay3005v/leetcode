//594. Longest Harmonious Subsequence


class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int num:nums){
            if(map.containsKey(num+1)){
                int cur=map.get(num)+map.get(num+1);
                max=Math.max(max,cur);
            }
        }
        return max;
    }
}
