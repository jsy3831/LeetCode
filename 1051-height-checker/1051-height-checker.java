class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
		if (heights == null || n < 2) return 0;

		int result = 0;

		int[] expected = Arrays.stream(heights)
			.sorted()
			.toArray();

		for (int i = 0; i < n; i++) {
			if (heights[i] != expected[i]) {
				heights[i] = expected[i];
				result++;
			}
		}

		return result;
    }
}