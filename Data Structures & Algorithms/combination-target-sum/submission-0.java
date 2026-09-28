class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        func(nums , n , ans , al , 0 , target, 0);
        return ans;
    }
    static void func(int[] arr , int n , List<List<Integer>> ans , List<Integer> al , int idx , int tar, int sum)
    {
        if(sum > tar) return ;
        if(idx == n)
        {
            if(sum == tar && !ans.contains(al)) ans.add(new ArrayList<>(al));
            return ;
        }
        al.add(arr[idx]);
        func(arr , n , ans , al , idx , tar , sum+arr[idx]);
        func(arr , n , ans , al , idx+1 , tar , sum+arr[idx]);
        al.remove(al.size()-1);
        func(arr , n , ans , al , idx+1 , tar , sum);
    }
}
