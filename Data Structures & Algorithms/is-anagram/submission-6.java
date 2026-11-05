class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sFrequencies = new HashMap<>();
        HashMap<Character, Integer> tFrequencies = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (sFrequencies.containsKey(s.charAt(i))){
                sFrequencies.put(s.charAt(i), sFrequencies.get(s.charAt(i)) + 1);
            } else {
                sFrequencies.put(s.charAt(i), 1);
            }

            if (tFrequencies.containsKey(t.charAt(i))){
                tFrequencies.put(t.charAt(i), tFrequencies.get(t.charAt(i)) + 1);
            } else {
                tFrequencies.put(t.charAt(i), 1);
            }
        }

        return sFrequencies.equals(tFrequencies);
    }
}
