//1957. Delete Characters to Make Fancy String


class Solution {
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray();
        char prev = chars[0];
        int count = 1;
        int pos = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != prev) {
                prev = chars[i];
                count = 0;
            }
            if (++count > 2) continue;
            chars[pos++] = chars[i];
        }
        return new String(chars, 0, pos);
    }
}
