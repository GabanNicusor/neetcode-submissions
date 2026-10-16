class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nums_map = new HashMap<>();

        for (int j = 0; j < nums.length; ++j) {
            int target_b = target - nums[j];

            if (nums_map.containsKey(target_b) && nums_map.get(target_b) != j) {
                if (j < nums_map.get(target_b)) {
                    return new int[] {j, nums_map.get(target_b)};
                } else {
                    return new int[] {nums_map.get(target_b), j};
                }
            } else {
                nums_map.put(nums[j], j);
            }
        }
        return new int[0];
    }
}
