import java.util.*;

// Blind 75 | Arrays & Hashing | Medium
// LeetCode 49: Group Anagrams
// Pattern: HashMap. Key = sorted word, Value = list of words.
// Time: O(n * k log k), Space: O(n * k)
class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word1 : strs) {
            char[] c = word1.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word1);
        }

        return new ArrayList<>(map.values());
    }
}
