//3582. Generate Tag for Video Caption


class Solution {
    public String generateTag(String caption) {
        if(caption.trim().isEmpty()){
            return "#";
        }
        String[] words = caption.trim().split("\\s+");
        StringBuilder sol = new StringBuilder("#"+words[0].toLowerCase());
        for(int i=1;i<words.length;i++){
            sol.append(words[i].toUpperCase().charAt(0));
            sol.append(words[i].toLowerCase().substring(1));
        }
        if(sol.length()>100){
            return sol.substring(0,100);
        }
        return sol.toString();
    }
}
