class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;

        Set<Character> substring = new HashSet<>();
        
        for (int r = 0; r < s.length(); r++){
            while(substring.contains(s.charAt(r))){
                substring.remove(s.charAt(l));
                l++;
            }
            substring.add(s.charAt(r));
            max = Math.max(r - l + 1, max);
        }

        return max;
    }
}
