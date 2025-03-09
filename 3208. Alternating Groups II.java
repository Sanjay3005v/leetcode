//3208. Alternating Groups II


class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] temp = new int[colors.length + k - 1];
        System.arraycopy(colors, 0, temp, 0, colors.length);
        System.arraycopy(colors, 0, temp, colors.length, k - 1);
        int count = 0;
        int i = 0;
        for (int j = 0; j < temp.length; j++) {
            if (j > 0 && temp[j] == temp[j - 1]) {
                i = j;
            }
            if (j - i + 1 >= k) {
                count++;
            }
        }
        return count;
    }
}
