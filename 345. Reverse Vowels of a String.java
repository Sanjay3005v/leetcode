//345. Reverse Vowels of a String


class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j) {
            int checki = 0;
            int checkj = 0;
            if (isVowel(ch[i])) {
                checki++;
            }
            if (isVowel(ch[j])) {
                checkj++;
            }
            if (checki == 1 && checkj == 1) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                checki = 0;
                checkj = 0;
                i++;
                j--;
            } else {
                if (checki == 0) {
                    i++;
                }
                if (checkj == 0) {
                    j--;
                }
            }
        }
        return String.valueOf(ch);
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U';
    }
}
