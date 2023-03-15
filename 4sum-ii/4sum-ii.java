class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
		for (int k : nums3)
			for (int l : nums4)
				map.put(k + l, map.getOrDefault(k + l, 0) + 1);

		int ans = 0;

		for (int i : nums1)
			for (int j : nums2)
				ans += map.getOrDefault(-(i + j), 0);

		return ans;
    }
}