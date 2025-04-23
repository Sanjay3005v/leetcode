//1399. Count Largest Group


class Solution {
    public int countLargestGroup(int n) {
        int[] nums = new int[37];
        int maxSum=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            nums[sum]++;
            maxSum=Math.max(maxSum,nums[sum]);
        }
        int count=0;
        for(int num : nums){
            if(num == maxSum){
                count++;
            }
        }
        return count;
    }
}
