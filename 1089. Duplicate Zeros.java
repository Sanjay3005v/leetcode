//1089. Duplicate Zeros


class Solution {
    public void duplicateZeros(int[] arr) {
        int[] nums = new int[arr.length];
        int j=0;
        for(int i=0;j<nums.length&&i<nums.length;i++){
            if(arr[i]==0){
                j+=2;
            }
            else{
                nums[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
    }
}
