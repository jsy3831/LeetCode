class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
		char[] j = jewels.toCharArray();
		char[] s = stones.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (char i : s) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (char i : j) {
			if (map.containsKey(i)) {
				ans += map.get(i);
			}
		}
		
		return ans;
    }
}