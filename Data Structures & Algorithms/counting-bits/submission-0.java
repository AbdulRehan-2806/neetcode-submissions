class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int num = 1 ; num <= n ; num++)
        {
            int cnt = 0;
            int ele = num;
            while(ele>0)
            {
                cnt++;
                ele = (ele&(ele-1));
            }
            ans[num] = cnt;
        }
        return ans;
    }
}
