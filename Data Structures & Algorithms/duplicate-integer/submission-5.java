class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> data = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (data.containsKey(nums[i])) {
                return true;
            }else {
              data.put(nums[i], 1);
            }
        }
        return false;
    }
}