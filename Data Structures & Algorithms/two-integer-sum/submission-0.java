class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (sum.size() != 0){
                if(sum.containsKey(difference)){
                    int[] s = {sum.get(difference), i};
                    return s;
                }
            }
            sum.put(nums[i], i);
        } 
        return null;
    }
}
