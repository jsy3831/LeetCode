class MapSum {
    HashMap<String, Integer> map;
    Trie root;
    
    public MapSum() {
        map = new HashMap<>();
        root = new Trie();
    }

    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        Trie cur = root;
        cur.score += delta;

        for (char c : key.toCharArray()) {
            cur.children.putIfAbsent(c, new Trie());
            cur = cur.children.get(c);
            cur.score += delta;
        }
    }

    public int sum(String prefix) {
        Trie cur = root;
        for (char c : prefix.toCharArray()) {
            cur = cur.children.get(c);
            if (cur == null) return 0;
        }
        
        return cur.score;
    }
}

class Trie {
    Map<Character, Trie> children = new HashMap<>();
    int score;
}
/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */