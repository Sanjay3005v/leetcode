//767. Reorganize String



class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> q = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        q.addAll(map.keySet());
        StringBuilder sol = new StringBuilder();
        while(q.size()>=2){
            char ch1 = q.poll();
            char ch2 = q.poll();
            sol.append(ch1);
            sol.append(ch2);
            map.put(ch1,map.get(ch1)-1);
            map.put(ch2,map.get(ch2)-1);
            if(map.get(ch1)>0){
                q.add(ch1);
            }
            if(map.get(ch2)>0){
                q.add(ch2);
            }
        }
        if(!q.isEmpty()){
            char ch = q.poll();
            if(map.get(ch)>1){
                return "";
            }
            sol.append(ch);
        }
        return sol.toString();
    }
}
