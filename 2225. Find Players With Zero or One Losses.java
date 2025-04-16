//2225. Find Players With Zero or One Losses


class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] lost = new int[100001];
        for(int i=0;i<matches.length;i++){
            int win = matches[i][0];
            int loss = matches[i][1];
            if(lost[win] == 0){
                lost[win] = -1;
            }
            if(lost[loss] == -1){
                lost[loss] = 1;
            }
            else{
                lost[loss]++;
            }
        }
        List<Integer> noloss = new ArrayList<>();
        List<Integer> oneloss = new ArrayList<>();

        List<List<Integer>> sol = new ArrayList<>();
        for(int i=0;i<lost.length;i++){
            if(lost[i] == -1){
                noloss.add(i);
            }
            else if(lost[i]==1){
                oneloss.add(i);
            }
        }
        sol.add(noloss);
        sol.add(oneloss);
        return sol;
    }
}
