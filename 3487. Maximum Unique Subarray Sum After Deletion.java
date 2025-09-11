//3487. Maximum Unique Subarray Sum After Deletion


class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            } else {
                max = Math.max(max, num);
            }
        }
        if(set.isEmpty()) {
            return max;
        }
        int sum = 0;
        for (int val : set) {
            sum += val;
        }
        return sum;
    }
}
