//3289. The Two Sneaky Numbers of Digitville


class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] sol = new int[2];
        int j=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==2){
                sol[j++]=i;
            }
            if(j>1){
                break;
            }
        }
        return sol;

    }
}
