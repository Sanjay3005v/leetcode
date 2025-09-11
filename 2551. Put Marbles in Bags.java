//2551. Put Marbles in Bags


class Solution {
    public long putMarbles(int[] weights, int k) {
        if (k == 1) {
            return 0;
        }

        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < weights.length - 1; i++) {
            sums.add(weights[i] + weights[i + 1]);
        }
        Collections.sort(sums);
        long min = 0, max = 0;
        for (int i = 0; i < k - 1; i++) {
            min += sums.get(i);
            max += sums.get(sums.size() - 1 - i);
        }

        return max-min;
    }
}
