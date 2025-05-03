//781. Rabbits in Forest


class Solution {
    public int numRabbits(int[] answers) {
        int sol=0;
        int[] count = new int[1000];
        for(int num:answers){
            if(count[num]%(num+1)==0){
                sol+=num+1;
            }
            count[num]++;
        }
        return sol;
    }
}
