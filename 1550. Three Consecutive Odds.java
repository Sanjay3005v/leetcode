//1550. Three Consecutive Odds


class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=arr.length-1;i>=2;i--){
            if(arr[i]%2 == 1 && arr[i-1]%2 == 1 && arr[i-2]%2 == 1){
                return true;
            }
        }
        return false;
    }
}
