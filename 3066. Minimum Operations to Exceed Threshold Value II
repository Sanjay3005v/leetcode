//3066. Minimum Operations to Exceed Threshold Value II
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> num= new PriorityQueue<>();
        for(int i :nums){
            num.add((long)i);
        }
        int count=0;
        while(num.peek()<k){
            long min1=num.poll();
            long min2=num.poll();
            long newnum= 2*Math.min(min1,min2)+Math.max(min1,min2);
            num.add(newnum);
            count++;
        }
        return count;
    }
}
