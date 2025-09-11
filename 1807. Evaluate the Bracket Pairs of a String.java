//1807. Evaluate the Bracket Pairs of a String


class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for(List<String> list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        System.out.println(map);
        Stack<Character> stack = new Stack<>();
        StringBuilder key = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                stack.pop();
                str.append(map.getOrDefault(key.toString(),"?"));
                key.setLength(0);
            }
            else if(!stack.isEmpty() && stack.peek()=='('){
                key.append(ch);
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}
