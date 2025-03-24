//2942. Find Words Containing Character



class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        for(String str:words){
            for(char ch:str.toCharArray()){
                if(ch==x){
                    list.add(i);
                    break;
                }
            }
            i++;
        }
        return list;
    }
}
