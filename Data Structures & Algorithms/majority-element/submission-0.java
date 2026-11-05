class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : nums){
            if (count.containsKey(i)){
                if (count.get(i) > nums.length/2){
                    return i;
                }
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }
        }
        for (int i : nums){
            if (count.get(i) > nums.length/2){
                return i;
            }
        }
        return -1;

    }
}