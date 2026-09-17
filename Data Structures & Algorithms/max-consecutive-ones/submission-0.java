class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int ones = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1)
            {
                ones++;
                max = Math.max(max , ones);
            }
            else ones = 0;
        }
        return max;
    }
}