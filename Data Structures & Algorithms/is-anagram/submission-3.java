class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> sCharacter = new HashMap<>();
        HashMap<Character, Integer> tCharacter = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (sCharacter.containsKey(s.charAt(i))){
                sCharacter.put(s.charAt(i), sCharacter.get(s.charAt(i)) + 1);
            } else {
                sCharacter.put(s.charAt(i), 1);
            }

            if (tCharacter.containsKey(t.charAt(i))){
                tCharacter.put(t.charAt(i), tCharacter.get(t.charAt(i)) + 1);
            } else {
                tCharacter.put(t.charAt(i), 1);
            }
        }

        return sCharacter.equals(tCharacter);
    }
}
