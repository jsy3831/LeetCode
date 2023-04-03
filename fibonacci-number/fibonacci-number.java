class Solution {
    
    Map<Integer, Integer> cache = new HashMap<>();
    
    public int fib(int n) {
        if (n < 0)
			return 0;

		if (cache.containsKey(n))
			return cache.get(n);

		int result;

		if (n < 2) {
			return n;
		}
		else {
			result = fib(n - 1) + fib(n - 2);
		}

		cache.put(n, result);

		return result;
    }
}