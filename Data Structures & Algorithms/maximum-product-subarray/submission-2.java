class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int max = nums[0] , min = nums[0] , ans = nums[0];
        for(int i=1;i<n;i++)
        {
            int cur = nums[i];
            if(cur < 1)
            {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(cur , cur*max);
            min = Math.min(cur , cur*min);
            ans = Math.max(ans , max);
        }
        return ans;
    }
}
// [2 , 8 , -24 , -120]
// [5 , -15 , -60 , -120]
