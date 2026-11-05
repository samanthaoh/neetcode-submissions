class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0, maxCount = 0; 

        for (int i : nums){
            count.put(i, count.getOrDefault(i, 0) + 1);
            if (count.get(i) > maxCount){
                res = i;
                maxCount = count.get(i);
            }
        }
        
        return res;

    }
}