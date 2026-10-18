import java.util.HashSet;
// Blind 75 | Arrays & Hashing | Easy
// LeetCode 217: Contains Duplicate
// Pattern: HashSet. Pehle dekha ya nahi.
// Time: O(n), Space: O(n)
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set  = new HashSet <> ();

        for (int i = 0 ;  i<nums.length; i++) {

            if (set.contains(nums[i])) {

                return true;
            }

           set.add(nums[i]);

        }
         return false ;
    }
}
