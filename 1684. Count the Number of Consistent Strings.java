//1684. Count the Number of Consistent Strings


class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count=words.length;
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        for(String str:words){
            for(char ch:str.toCharArray()){
                if(!set.contains(ch)){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
