class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

		int m = mat.length;
		int n = mat[0].length;
		int[] result = new int[m * n];

		Map<Integer, List<Integer>> dictionary = new HashMap<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int sum = i + j; // the sum of the coordinates is a constant.

				if (!dictionary.containsKey(sum)) {
					dictionary.put(sum, new ArrayList<>());
				}

				dictionary.get(sum).add(mat[i][j]);
			}
		}

		int ctr = 0;
		for (Map.Entry<Integer, List<Integer>> entry : dictionary.entrySet()) {
			List<Integer> temp = new ArrayList<>();

			if (entry.getKey() % 2 == 0) {
				temp = entry.getValue();
				Collections.reverse(temp);
			} else {
				temp = entry.getValue();
			}

			for (int i = 0; i < temp.size(); i++) {
				result[ctr++] = temp.get(i);
			}
		}

		return result;
    }
}