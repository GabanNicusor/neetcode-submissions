class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nums_map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            nums_map.put(nums[i], i);
        }
        
        for (int j = 0; j < nums.length; ++j) {
            if (nums_map.containsKey(target - nums[j]) && nums_map.get(target - nums[j]) != j) {
                if (j < nums_map.get(target - nums[j])) {
                    return new int[] {j, nums_map.get(target - nums[j])};
                } else {
                    return new int[] {nums_map.get(target - nums[j]), j};
                }
            }
        }
        return null;
    }
}
