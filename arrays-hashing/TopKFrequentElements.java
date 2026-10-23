
import java.util.*;
// Blind 75 | Arrays & Hashing | Medium
// LeetCode 347: Top K Frequent Elements
// Pattern: HashMap (count) + sort keys by frequency. Key = number, Value = count.
// Time: O(n log n), Space: O(n)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // HashMap creation
        HashMap <Integer , Integer> map = new HashMap <> ();

        //Check keys in the Map
        for (int num : nums) {
        map.put(num , map.getOrDefault(num , 0 ) + 1);
        }

        // Putting keys in the list
        List<Integer> list = new ArrayList <> (map.keySet());

        // Sort list on frequency
        list.sort((a,b) -> map.get(b) - map.get(a));

        // Top k element Return

        int [] result = new int [k];
        for (int i = 0; i< k; i++) {
            result[i] = list.get(i);
        }


        return result;



    }
}
