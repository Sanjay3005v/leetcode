//2410. Maximum Matching of Players With Trainers


class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        if(players.length==0){
            return 0;
        }
        int count=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = players.length-1;
        int j = trainers.length-1;
        while(i>=0 && j>=0){
            if(players[i]<=trainers[j]){
                count++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        return count;
    }
}
