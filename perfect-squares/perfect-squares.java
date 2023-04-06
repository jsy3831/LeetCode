class Solution {
    public int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();
		Set<Integer> visited = new HashSet<>();
		int level = 0;

		q.offer(0);
		visited.add(0);

		while (!q.isEmpty()) {
			int size = q.size();
			level++;

			while (size-- > 0) {
				int cur = q.poll();

				for (int i = 1; i * i <= n; i++) {
					int temp = cur + (i * i);

					if (temp == n)
						return level;

					if (temp > n)
						break;

					if (!visited.contains(temp)) {
						q.offer(temp);
						visited.add(temp);
					}
				}
			}
		}

		return level;
    }
}