// Blind 75 | Arrays & Hashing | Medium
// LeetCode 238: Product of Array Except Self
// Pattern: prefix and suffix products (two passes), no division.
// Time: O(n), Space: O(1) extra (output array not counted)
class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // left pass: ans[i] = product of everything before i
        int leftpro = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = leftpro;
            leftpro *= nums[i];
        }

        // right pass: multiply by product of everything after i
        int rightpro = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightpro;
            rightpro *= nums[i];
        }

        return ans;
    }
}
