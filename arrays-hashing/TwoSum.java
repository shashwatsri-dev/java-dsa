import java.util.HashMap;

// Blind 75 | Arrays & Hashing | Easy
// LeetCode 1: Two Sum
// Pattern: HashMap. Key = number, Value = index.
// Time: O(n), Space: O(n)class TwoSum

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
