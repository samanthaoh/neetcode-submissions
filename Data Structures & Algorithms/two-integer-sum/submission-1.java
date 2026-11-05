class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> total = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (total.size() != 0){
                if (total.containsKey(difference)){
                    return new int[]{total.get(difference), i};
                }
            }
            total.put(nums[i], i);
        }
        return null;
    }
}
