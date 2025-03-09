//2379. Minimum Recolors to Get K Consecutive Black Blocks


class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='B'){
                    count++;
                }
                if(blocks.charAt(j)=='W'){
                    break;
                }
            }
            if(count==k){
                return 0;
            }
        }
        for(int i=0;i<=blocks.length()-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W'){
                    count++;
                }
            }
            if(count<min){
                min=count;
            }
        }
        return min;
    }
}
