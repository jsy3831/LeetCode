class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
		int mostWealth = 0;

		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[i].length; j++) {
				wealth += accounts[i][j];
			}

			if (wealth > mostWealth) {
				mostWealth = wealth;
			}
			wealth = 0;
		}
		return mostWealth;
    }
}