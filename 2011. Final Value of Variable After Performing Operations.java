//2011. Final Value of Variable After Performing Operations


class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sol = 0;
        for(String i:operations){
            if(i.equals("X--") || i.equals("--X")){
                sol--;
            }
            else{
                sol++;
            }
        }
        return sol;
    }
}
