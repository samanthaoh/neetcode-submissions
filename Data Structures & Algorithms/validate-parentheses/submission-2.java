class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        HashMap<Character, Character> brackets = new HashMap<>();

        brackets.put(')','(');
        brackets.put(']','[');
        brackets.put('}','{');

        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (brackets.containsKey(s.charAt(i))){
                Character temp = parentheses.isEmpty() ? '#' : parentheses.pop();
                if (brackets.get(s.charAt(i)) != temp){
                    return false;
                }
            } else {
                parentheses.push(s.charAt(i));
            }
        }
        return parentheses.isEmpty();



    }
}
