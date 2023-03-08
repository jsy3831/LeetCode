class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int i : nums1)
			set1.add(i);
		for (int i : nums2)
			set2.add(i);

		for (int i : set1) {
			if (set2.contains(i))
				list.add(i);
		}
			
		return list.stream().mapToInt(i -> i).toArray();
    }
}