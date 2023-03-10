class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		int leastIndexSum = Integer.MAX_VALUE;

		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}

		for (int i = 0; i < list2.length; i++) {
			map2.put(list2[i], i);
		}

		for (String key : map1.keySet()) {
			if (map2.containsKey(key)) {
				leastIndexSum = Math.min(leastIndexSum, map1.get(key) + map2.get(key));
			}
		}

		List<String> list = new ArrayList<>();
		int count = 0;

		for (String key : map1.keySet()) {
			if (map2.containsKey(key)) {
				int num = map1.get(key) + map2.get(key);

				if (num == leastIndexSum) {
					list.add(key);
					count++;
				}
			}
		}

		String[] answer = new String[count];

		for (int i = 0; i < count; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
    }
}