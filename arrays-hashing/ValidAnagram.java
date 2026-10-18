import java.util.HashMap;
// Blind 75 | Arrays & Hashing | Easy
// LeetCode 242: Valid Anagram
// Pattern: HashMap. Key = letter, Value = count.
// Time: O(n), Space: O(1)

class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false ;
        }

    HashMap<Character , Integer> map = new HashMap <> ();

    for (int i = 0; i<s.length(); i++) {

        char c = s.charAt(i);
        map.put(c ,map.getOrDefault(c , 0) + 1);
    }

    for (int i = 0; i<t.length (); i++) {

        char c = t.charAt(i);

        map.put(c ,map.getOrDefault(c , 0) - 1);
    }

    // checking..

    for (int cal : map.values()) {
        if (cal != 0) {
            return false ;
        }
    }

        return true ;
    }
}
