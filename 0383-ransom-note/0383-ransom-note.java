import java.util.Collection;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer, Character> ransomNoteMap = new HashMap<>();
		HashMap<Integer, Character> magazineMap = new HashMap<>();

		for (int i = 0; i < ransomNote.length(); i++) {
			ransomNoteMap.put(i, ransomNote.charAt(i));
		}

		for (int i = 0; i < magazine.length(); i++) {
			magazineMap.put(i, magazine.charAt(i));
		}

		if (ransomNoteMap.size() > magazineMap.size()) {
			return false;
		}

		Collection<Character> magaValues = magazineMap.values();
		Set<Map.Entry<Integer, Character>> ranEntries = ransomNoteMap.entrySet();

		for (Character tempMegaValue : magaValues) {
			Iterator<Map.Entry<Integer, Character>> ranItr = ranEntries.iterator();
			while (ranItr.hasNext()) {
				if (ranItr.next().getValue() == tempMegaValue) {
					ranItr.remove();
					break;
				}
			}

            if(ransomNoteMap.isEmpty()) return true;
		}

        return false;
    }
}