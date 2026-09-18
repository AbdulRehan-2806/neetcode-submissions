class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int n : nums) set.add(n);
        for(int num : nums)
        {
            if(!set.contains(num-1)){
                int cnt = 0;
                int ele = num;
                while(set.contains(ele)){
                    cnt++;
                    ele++;
                }
                res = Math.max(res,cnt);
            }
        }
        return res;
    }
}
