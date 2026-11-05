class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] frequencies = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < frequencies.length; i++){
            frequencies[i] = new ArrayList<>();
            // Generate an empty array list for all the frequencies
        }
        for (int i : nums){
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        int[] results = new int[k];
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            frequencies[entry.getValue()].add(entry.getKey());
        }
        int index = 0;
        for (int i = frequencies.length - 1; i > 0 && index < k; i--){
            for (int n : frequencies[i]){
                results[index++] = n;
                if (index == k){
                    return results;
                }
            }
        }
        return results;

    }
}
