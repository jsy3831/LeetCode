class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
		if (nums == null || n == 0) return null;

		Arrays.sort(nums);
		Set<Integer> set = new LinkedHashSet<>();

		for (int num : nums) {
			set.add(num);
		}

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (!set.contains(i+1)) {
				result.add(i+1);
			}
		}
		
		return result;
    }
}