class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < len; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}

		return null;
    }
}