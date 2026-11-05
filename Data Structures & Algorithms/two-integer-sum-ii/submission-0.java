class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> sums = new HashMap<>();

        for (int i = 0; i < numbers.length; i++){
            if (sums.containsKey(numbers[i])){
                return new int[]{sums.get(numbers[i]), i + 1};
            } else {
                sums.put(target - numbers[i], i + 1);
            }
        }
        return null;
    }
}
