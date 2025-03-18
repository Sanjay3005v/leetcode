//215. Kth Largest Element in an Array


class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i:nums){
            q.add(i);
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            max = q.poll();
        }
        return max;
    }
}
