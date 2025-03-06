//2965. Find Missing and Repeated Values


class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length * grid.length + 1];
        for (int[] i : grid) {
            for (int j : i) {
                int val = j;
                arr[val]++;
            }
        }
        int rep = 0;
        int miss = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                miss = i;
            } else if (arr[i] == 2) {
                rep = i;
            }
        }
        return new int[] { rep, miss };
    }
}
