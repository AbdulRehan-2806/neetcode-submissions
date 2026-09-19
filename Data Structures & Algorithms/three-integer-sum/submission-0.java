class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i=0 , j = 1 , k = n-1;
        while(i<(n-2))
        {
            j = i+1;
            k = n-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                {
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    if(!ans.contains(al))ans.add(al);
                    j++;
                    k--;
                }
                else if(sum < 0) j++;
                else k--;
            }
            i++;
        }
        return ans;
    }
}
