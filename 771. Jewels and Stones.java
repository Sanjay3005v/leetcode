//771. Jewels and Stones


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewel = new HashSet<>();
        int count=0;
        for(char ch:jewels.toCharArray()){
            jewel.add(ch);
        }
        for(char ch:stones.toCharArray()){
            if(jewel.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
