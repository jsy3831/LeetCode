class Solution {
    public int thirdMax(int[] nums) {
        int len = nums.length;
		int third = 0;
		if (nums == null || len == 0) return third;

		Integer[] sortedNums = Arrays.stream(nums)
			.boxed()
			.distinct()
			.sorted(Comparator.reverseOrder())
			.toArray(Integer[]::new);

		if (sortedNums.length < 3) {
			third = sortedNums[0];
		} else {
			third = sortedNums[2];
		}

		return third;
    }
}