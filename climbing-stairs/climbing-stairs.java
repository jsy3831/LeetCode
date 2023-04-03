class Solution {
    // Dynamic Programming - Top Down
	Map<Integer, Integer> cache = new HashMap<>();
    
    public int climbStairs(int n) {
        int result;
        
        // base case
		if (n < 4)
			return n;
		// memoization
		else if (cache.containsKey(n))
			return cache.get(n);
		else
			// recurrence relation
			result = climbStairs(n - 1) + climbStairs(n - 2);

		// keep the result in cache
		cache.put(n, result);

		return result;
    }
}