//1460. Make Two Arrays Equal by Reversing Subarrays


class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];
        for(int i=0;i<target.length;i++){
            count[target[i]]++;
            count[arr[i]]--;
        }
        for(int num:target){
            if(count[num]!=0){
                return false;
            }
        }
        return true;
    }
}
