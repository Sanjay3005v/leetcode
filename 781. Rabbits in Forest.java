//781. Rabbits in Forest


class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer>  map = new HashMap<>();
        for(int num : answers){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int tot=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int count = entry.getValue();
            int same = (count+key)/(key+1);
            tot+= same*(key+1);
        }
        return tot;
    }
}
