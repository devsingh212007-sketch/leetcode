
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int x : nums)
            count[x]++;

        int a = 0, b = 0;

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) a = i;
            if (count[i] == 0) b = i;
        }

        return new int[]{a, b};
    }
}
