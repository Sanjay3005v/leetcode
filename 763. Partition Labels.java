//763. Partition Labels


class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer> list = new ArrayList<>();
        int start =0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            end=Math.max(end,map.get(s.charAt(i)));
            if(i==end){
                list.add(end-start+1);
                start =i+1;
            }
        }
        return list;
    }
}
