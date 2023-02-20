class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return digits;

		List<Integer> list = Arrays.stream(digits)
			.boxed()
			.collect(
				Collectors.collectingAndThen(
					Collectors.toList(),
					l -> {
						Collections.reverse(l);
						return l;
					}
				)
			);

		int size = list.size();
		for (int i = 0; i < size; i++) {
			int mod = (list.get(i) + 1) % 10;
			list.set(i, mod);

			if (mod != 0) break;
		}

		if (list.get(size - 1) == 0) list.add(1);

		Collections.reverse(list);
		int[] arr = list.stream()
			.mapToInt(Integer::intValue)
			.toArray();

		return arr;
    }
}