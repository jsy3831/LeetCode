class Solution {
    public List<Integer> getRow(int rowIndex) {
		List<Integer> curRow = new ArrayList<>();
		curRow.add(1);

		if (rowIndex == 0)
			return curRow;

		List<Integer> prevRow = getRow(rowIndex - 1);
		for (int i = 0; i < prevRow.size() - 1; i++) {
			curRow.add(prevRow.get(i) + prevRow.get(i + 1));
		}

		curRow.add(1);
		return curRow;
	}
}