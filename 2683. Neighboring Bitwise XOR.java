//2683. Neighboring Bitwise XOR


class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int count =0;
        for(int i:derived){
            count^=i;
        }
        return count==0;
    }
}
