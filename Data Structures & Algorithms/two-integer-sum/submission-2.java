class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sums = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++){
            if (sums.containsKey(nums[i])){
                indices[0] = sums.get(nums[i]);
                indices[1] = i;
            } else {
                sums.put(target - nums[i], i);
            }
        }
        return indices;
    }
}
