//1324. Print Words Vertically

class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<String>();
        int max=0;
        for(String word:s.split(" ")){
            max=Math.max(max,word.length());
        }
        for(int i=0;i<max;i++){
            StringBuilder str = new StringBuilder();
            for(String word:s.split(" ")){
                str.append(i<word.length()?word.charAt(i):" ");
            }
            list.add(str.toString().stripTrailing());
        }
        return list;
    }
}
