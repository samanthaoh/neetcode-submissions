class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        HashMap<Character, Character> corresponding = new HashMap<>();
        corresponding.put(')', '(');
        corresponding.put(']', '[');
        corresponding.put('}', '{');

        for (char i : s.toCharArray()){
            if (corresponding.containsKey(i)){
                if (!brackets.isEmpty() && brackets.peek() == corresponding.get(i)){
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(i);
            }
        }
        if (brackets.isEmpty()){
            return true;
        }
        return false;
    }
}
