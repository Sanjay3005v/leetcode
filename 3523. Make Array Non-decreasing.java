//3523. Make Array Non-decreasing


class Solution {
    public int maximumPossibleSize(int[] nums) {
         Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() > num) {
                num = Math.max(num, stack.pop());
            } 
        stack.push(num);
        }
        return stack.size();
    }
}
